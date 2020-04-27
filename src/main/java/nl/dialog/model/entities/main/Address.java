package nl.dialog.model.entities.main;

import lombok.Getter;
import org.springframework.data.geo.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Address")
@Table(name = "addresses")
public class Address {

    @Id
    @Getter
    private Integer id;

    @Getter
    @Column
    private String street;

    @Getter
    @Column
    private Integer number;

    @Getter
    @Column
    private String letter;

    @Getter
    @Column
    private String additional;

    @Getter
    @Column
    private String postcode;

    @Getter
    @Column
    private String city;

    @Getter
    @Column
    private String municipality;

    @Getter
    @Column
    private String province;

    @Getter
    @Column
    private String purpose;

    @Getter
    @Column
    private Double longitude;

    @Getter
    @Column
    private Double latitude;

    @Getter
    @Column(nullable = false)
    @NotNull
    private Point coordinates;
}
