package nl.dialog.model.entities.main;

import lombok.Getter;

import javax.persistence.*;

@Entity(name = "Personalization")
@Table(name = "personalizations")
public class Personalization {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column(columnDefinition = "TEXT")
    private String css;

    @Getter
    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] logo;

}
