package ing.officetools.demostore;

import ing.officetools.demostore.model.Category;
import ing.officetools.demostore.model.Product;
import ing.officetools.demostore.service.CategoryService;
import ing.officetools.demostore.service.ProductService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
@Order(2)
public class ServiceTest {

    @Autowired
    private CategoryService categoryService ;

    @Autowired
    private ProductService productService ;

    @Test
    @Order(1)
    void getAllCategoryTest() {
        var list=categoryService.getAllCategory(); //  .getAllProducts();
        list.forEach(System.out::println);
        Assert.isTrue(!list.isEmpty(),"Error");
    }

    @Test
    @Order(2)
    void findCategoryByNameTest() {
        var obj=categoryService.findCategoryByName("tools");
        System.out.println(obj);
        Assert.isTrue(obj!=null,"Error");
    }

    //Equivalent to findCategoryByNameTest()
    @Test
    @Order(3)
    void findCategoryByNameTest2() {
        var obj=categoryService.findByName("tools"); ;
        System.out.println(obj);
        Assert.isTrue(obj!=null,"Error");
    }

    @Test
    @Order(4)
    void findCategoryByNameTest3() {
        var obj=categoryService.anotherFindCategoryByName("tools"); ;
        System.out.println(obj);
        Assert.isTrue(obj!=null,"Error");
    }

    @Test
    @Order(5)
    void getAllProductTest() {
        var list=productService.getAllProducts(); //  .getAllProducts();
        list.forEach(System.out::println);
        Assert.isTrue(!list.isEmpty(),"Error");
    }

    @Test
    @Order(6)
    @Transactional
    void addCategoryTest() {

        Category category = new Category(null,"NEW",null);
        Category newCategory =categoryService.addCategory(category);
        System.out.println(newCategory);
        Assert.notNull(newCategory,"Error");
    }

    @Test
    @Order(7)
    @Transactional
    void updateCategoryTest() {

        Category category = categoryService.getCategoryById(Long.valueOf(1));
        category.setName("XXX");
        Category updated=categoryService.updateCategory(category);
        System.out.println(updated);
        Assert.notNull(updated,"Error");
    }

    @Test
    @Order(8)
    @Transactional  //if specified, then transaction is rollback in unit test!
    void addProductTest() {

        Category category = new Category(1L,"tools","electric tools");
        Product product = new Product(null,"temp-product","temp product",68.0d,"Bosh",3,category);

        Product newProduct=productService.saveProduct(product);
        System.out.println(newProduct.toString());
        Assert.notNull(newProduct,"Error");
    }

}
