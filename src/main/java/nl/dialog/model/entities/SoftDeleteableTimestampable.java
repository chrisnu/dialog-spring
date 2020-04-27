package nl.dialog.model.entities;

import javax.persistence.Column;
import java.util.Calendar;

public class SoftDeleteableTimestampable {

    @Column
    private Calendar deletedAt;

    @Column
    private Calendar createdAt;

    @Column
    private Calendar updatedAt;
}
