package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;
import nl.dialog.model.entities.SoftDeletable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "Users")
@Table(name = "users")
public class User extends SoftDeletable {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String name;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String email;

    @Getter
    @Setter
    @ManyToMany
    private List<Project> projects;
}
