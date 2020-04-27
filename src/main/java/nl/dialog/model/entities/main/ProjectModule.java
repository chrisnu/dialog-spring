package nl.dialog.model.entities.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "ProjectModule")
@Table(name = "projects_modules")
public class ProjectModule {

    @EmbeddedId
    private ProjectModuleId id;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId(value = "projectsId")
    @NotNull
    private Project projects;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId(value = "modulesId")
    @NotNull
    private Module modules;

    @Getter
    @Setter
    @Column
    private String config;
}

@Embeddable
class ProjectModuleId implements Serializable {

    @Column
    private Integer projectsId;

    @Column
    private Integer modulesId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectModuleId that = (ProjectModuleId) o;
        return Objects.equals(modulesId, that.modulesId) &&
                Objects.equals(projectsId, that.projectsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modulesId, projectsId);
    }
}
