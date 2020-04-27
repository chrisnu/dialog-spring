package nl.dialog.model.entities.main;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "Permit")
@Table(name = "permits")
public class Permit {

    @EmbeddedId
    private PermitId id;

    @ManyToOne
    @NotNull
    Permission permission;

    @ManyToOne
    @NotNull
    Project project;

    @ManyToOne
    @NotNull
    Project user;
}

@Embeddable
class PermitId implements Serializable {

    @Column
    private Integer permissionId;

    @Column
    private Integer projectId;

    @Column
    private Integer userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PermitId that = (PermitId) o;
        return Objects.equals(permissionId, that.permissionId) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, projectId, userId);
    }
}
