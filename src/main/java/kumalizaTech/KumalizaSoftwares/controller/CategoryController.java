package kumalizaTech.KumalizaSoftwares.controller;


import kumalizaTech.KumalizaSoftwares.io.CategoryRequest;
import kumalizaTech.KumalizaSoftwares.io.CategoryResponse;
import kumalizaTech.KumalizaSoftwares.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor

public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){
        return categoryService.add(request);
    }
}
