package ing.officetools.demostore.repository;

import ing.officetools.demostore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    //***************************************************************************
    // All CRUD operations are extended from JpaRepository interface
    // - getAllxx, getxxById, savexx, deletexx.

    //***************************************************************************
    // Derived queries directly from method names
    // Note: these both functions produce the same query
    Optional<Category> findCategoryByName(String name);
    Optional<Category> findByName(String name);

    //***************************************************************************
    // Using named queries
    @Query("select cat from Category cat where cat.name = ?1")
    Category anotherFindCategoryByName(String name);
}