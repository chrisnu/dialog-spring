package nl.dialog.model.entities;

import javax.persistence.Column;
import java.util.Calendar;

public class TimestampAble {

    @Column
    private Calendar createdAt;

    @Column
    private Calendar updatedAt;
}
