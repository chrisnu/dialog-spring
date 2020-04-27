package nl.dialog.model.entities.main;

import lombok.Getter;
import nl.dialog.model.entities.SoftDeletable;

import javax.persistence.*;

@Entity(name = "Customer")
@Table(name = "customers")
public class Customer extends SoftDeletable {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    private String name;

    @Getter
    @Column(nullable = false)
    private String description;

    @Getter
    @OneToOne
    private Personalization personalization;
}
