package ing.officetools.demostore.service;
import ing.officetools.demostore.model.Product;
import ing.officetools.demostore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyShopProductService implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // from JpaRepository interface
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);  // from JpaRepository interface
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product); // from JpaRepository interface
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id); // from JpaRepository interface
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product); // from JpaRepository interface
    }
}
