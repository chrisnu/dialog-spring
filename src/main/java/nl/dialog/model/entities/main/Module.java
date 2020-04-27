package nl.dialog.model.entities.main;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "Module")
@Table(name = "modules")
public class Module {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String module_id;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String moduleName;
}
