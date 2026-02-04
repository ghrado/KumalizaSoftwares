package kumalizaTech.KumalizaSoftwares.service.impl;

import kumalizaTech.KumalizaSoftwares.entity.CategoryEntity;
import kumalizaTech.KumalizaSoftwares.io.CategoryRequest;
import kumalizaTech.KumalizaSoftwares.io.CategoryResponse;
import kumalizaTech.KumalizaSoftwares.repository.CategoryRepository;
import kumalizaTech.KumalizaSoftwares.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponse add(CategoryRequest request) {
       CategoryEntity newCategory = convertToEntity(request);
       newCategory = categoryRepository.save(newCategory);
       return convertToResponse(newCategory);
    }

    private CategoryResponse convertToResponse(CategoryEntity newCategory) {
        return CategoryResponse.builder()
                .categoryId(newCategory.getCategoryId())
                .name(newCategory.getName())
                .description(newCategory.getDescription())
                .bgColor(newCategory.getBgColor())
                .imgUrl(newCategory.getImgUrl())
                .createAt(newCategory.getCreateAt())
                .updateArt(newCategory.getUpdateAt())
                .build()
    }

    private CategoryEntity convertToEntity(CategoryRequest request) {
        return CategoryEntity.builder()
                .categoryId(UUID.randomUUID().toString())
                .name(request.getName())
                .description(request.getDescription())
                .bgColor(request.getBgColor())
                .build();
    }
}
