package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Config")
@Table(name = "configs")
public class Config {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Setter
    @ManyToOne
    private Project project;
}
