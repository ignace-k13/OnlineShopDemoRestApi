package ing.officetools.demostore.repository;
import ing.officetools.demostore.model.Category;
import ing.officetools.demostore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // All CRUD operations are extended from JpaRepository interface:
    //   getAll, getById, save, delete.

    // Derived queries directly from method names
    Optional<Product> findProductByName(String name);
}