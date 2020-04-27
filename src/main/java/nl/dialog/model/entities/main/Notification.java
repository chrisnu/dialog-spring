package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Entity(name = "Notification")
@Table(name = "notifications")
public class Notification {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false, columnDefinition = "TEXT")
    @NotNull
    private String data;

    @Getter
    @Column(nullable = false)
    @NotNull
    private Calendar timestamp;

    @Getter
    @Column
    private Calendar scheduledSendDate;

    @Getter
    @Setter
    @OneToOne
    @NotNull
    private Project projects;

    @Getter
    @Setter
    @OneToOne
    @NotNull
    private User users;
}
