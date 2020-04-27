package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Entity(name = "Notification")
@Table(name = "notifications")
public class Notification {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(nullable = false, columnDefinition = "TEXT")
    private String data;

    @Getter
    @Column(nullable = false)
    private Calendar timestamp;

    @Getter
    @Column
    private Calendar scheduledSendDate;

    @Getter
    @Setter
    @OneToOne
    private Project project;

    @Getter
    @Setter
    @OneToOne
    private User user;
}
