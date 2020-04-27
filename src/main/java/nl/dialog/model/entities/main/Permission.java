package nl.dialog.model.entities.main;

import lombok.Getter;
import nl.dialog.model.enums.PermissionGroup;
import nl.dialog.model.enums.PermissionType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Permission")
@Table(name = "permissions")
public class Permission {

    @Id
    @Getter
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull
    private PermissionType permission;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull
    private PermissionGroup group;
}
