package ing.officetools.demostore.controller;

import ing.officetools.demostore.model.Category;
import ing.officetools.demostore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
// http://localhost:8085/store/api/categories
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
    //public Optional<Category> getCategoryById(@PathVariable("id") Integer id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @PostMapping("")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @PutMapping("{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable("id") Long id){
        categoryService.updateCategory(category);
    }
}

