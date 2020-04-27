package nl.dialog.model.entities.main;

import lombok.Getter;
import nl.dialog.model.entities.TimestampAble;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "UserRegistration")
@Table(name = "user_registrations")
public class UserRegistration extends TimestampAble {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false)
    @NotNull
    private String ip;

    @Column(nullable = false)
    @NotNull
    private String email;
}
