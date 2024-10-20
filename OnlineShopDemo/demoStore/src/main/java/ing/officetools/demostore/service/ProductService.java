package ing.officetools.demostore.service;

import ing.officetools.demostore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductService  {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

    void deleteProduct(Product product);
}
