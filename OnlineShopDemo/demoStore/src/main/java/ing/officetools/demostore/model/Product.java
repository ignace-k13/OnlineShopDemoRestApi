package ing.officetools.demostore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//Lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//JPA annotations
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRD_ID", nullable = false)
    private Long id;

    @Lob
    @Column(name = "PRD_NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "PRD_DESCRIPTION")
    private String description;

    @Column(name = "PRD_UNITPRICE", nullable = false)
    private Double unitprice;

    @Lob
    @Column(name = "PRD_BRAND")
    private String brand;

    @Column(name = "PRD_STOCK", nullable = false)
    private Integer stock;

    @ManyToOne //(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PRD_CAT_ID", nullable = false)
    private Category category;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Id=" + id + ", Name=" + name + ", Brand="  + brand + ", Unitprice=" + unitprice + ", Stock=" + stock + ", " + category + "]";
    }

}