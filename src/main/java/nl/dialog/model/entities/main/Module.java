package nl.dialog.model.entities.main;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Module")
@Table(name = "modules")
public class Module {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    private String module_id;

    @Getter
    @Column(nullable = false)
    private String moduleName;
}
