package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Config")
@Table(name = "configs")
public class Config {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Setter
    @Column
    private String defaultMap;

    @Getter
    @Setter
    @ManyToOne
    @NotNull
    private Project projects;
}
