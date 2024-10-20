package ing.officetools.demostore;

import ing.officetools.demostore.repository.CategoryRepository;
import ing.officetools.demostore.repository.ProductRepository;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
@Order(1)
public class RepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Order(1)
    @Test
    void findAllCategoryTest() {
        var list=categoryRepository.findAll();
        list.forEach(System.out::println);
        Assert.isTrue(!list.isEmpty(),"Error");
    }

    @Order(2)
    @Test
    void findAllProductTest() {
        var list=productRepository.findAll();
        list.forEach(System.out::println);
        Assert.isTrue(!list.isEmpty(),"Error");
    }
}
