package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;
import nl.dialog.model.entities.SoftDeletable;

import javax.persistence.*;
import java.util.List;

@Entity(name = "User")
@Table(name = "users")
public class User extends SoftDeletable {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    private String name;

    @Getter
    @Column(nullable = false)
    private String email;

    @Getter
    @Setter
    @ManyToMany
    private List<Project> projects;
}
