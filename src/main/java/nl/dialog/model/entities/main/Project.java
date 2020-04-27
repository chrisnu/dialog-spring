package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;
import nl.dialog.model.entities.SoftDeletable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.List;

@Entity(name = "Project")
@Table(name = "projects")
public class Project extends SoftDeletable {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String code;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String name;

    @Getter
    @Column
    private String description;

    @Getter
    @ManyToOne
    @NotNull
    private Customer customers;

    @Getter
    @OneToOne
    private Personalization personalization;

    @Getter
    @Column
    private Calendar expiredAt;

    @Getter
    @Setter
    @OneToMany(
            mappedBy = "projects",
            cascade = CascadeType.ALL
    )
    private List<ProjectModule> modules;
}
