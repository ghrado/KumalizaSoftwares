package kumalizaTech.KumalizaSoftwares.controller;


import kumalizaTech.KumalizaSoftwares.io.CategoryRequest;
import kumalizaTech.KumalizaSoftwares.io.CategoryResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")

public class CategoryController {

    public CategoryResponse addCategory(@RequestBody CategoryRequest request){

    }
}
