package nl.dialog.model.entities.main;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "Admin")
@Table(name = "admins")
public class Admin {

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
    @Column(nullable = false)
    @NotNull
    private String password;
}
