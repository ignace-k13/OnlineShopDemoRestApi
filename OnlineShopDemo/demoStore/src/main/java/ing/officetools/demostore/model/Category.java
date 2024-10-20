package ing.officetools.demostore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//JPA annotations
@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAT_ID", nullable = false)
    private Long id;

    @Lob
    @Column(name = "CAT_NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "CAT_DESCRIPTION")
    private String description;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Id=" + id + ", Name=" + name + ", Description=" + description + "]";
    }
}