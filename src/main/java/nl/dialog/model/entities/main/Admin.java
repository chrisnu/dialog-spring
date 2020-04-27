package nl.dialog.model.entities.main;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Notification")
@Table(name = "notifications")
public class Admin {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    private String name;

    @Getter
    @Column(nullable = false)
    private String email;
}
