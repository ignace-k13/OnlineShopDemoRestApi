package ing.officetools.demostore.service;

import ing.officetools.demostore.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    //CRUD functions
    List<Category> getAllCategory();
    Category getCategoryById(Long id);

    // Better to use addCategory and updateCategory
    Category saveCategory(Category category);
    Category addCategory(Category category);
    Category updateCategory(Category category);

    void deleteCategory(Long id);
    void deleteCategory(Category category);


    // Derived queries directly from method names
    Optional<Category> findCategoryByName(String name);
    Optional<Category> findByName(String name);

    // Using named queries
    Category anotherFindCategoryByName(String name);




}
