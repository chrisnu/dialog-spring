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
    @MapsId(value = "projectId")
    @NotNull
    private Project project;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId(value = "moduleId")
    @NotNull
    private Module module;

    @Getter
    @Setter
    @Column
    private String config;
}

@Embeddable
class ProjectModuleId implements Serializable {

    @Column
    private Integer projectId;

    @Column
    private Integer moduleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectModuleId that = (ProjectModuleId) o;
        return Objects.equals(moduleId, that.moduleId) &&
                Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleId, projectId);
    }
}
