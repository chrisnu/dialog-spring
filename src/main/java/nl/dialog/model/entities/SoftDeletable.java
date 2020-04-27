package nl.dialog.model.entities;

import javax.persistence.Column;
import java.util.Calendar;

public class SoftDeletable {

    @Column
    private Calendar deletedAt;
}
