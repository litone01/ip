package duke.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Inherited from Task, used to store information related to tasks of type 'deadline'.
 *
 * Deadlines are tasks that need to be done before a specific date/time
 */
public class Deadline extends Task{
    protected LocalDate by;

    /**
     * Constructor for Deadline class object
     * @param description deadline description
     * @param by a string that represents timing to be completed by
     *           currently, only "yyyy-mm-dd" format is supported.
     */
    public Deadline(String description, String by) throws DukeException {
        super(description);
        try {
            this.by = LocalDate.parse(by);
        } catch (DateTimeParseException e) {
            throw new DukeException("invalid deadline date given.");
        }
    }

    public Deadline(String description, boolean isDone, String by) throws DukeException {
        super(description);
        try {
            this.by = LocalDate.parse(by);
        } catch (DateTimeParseException e) {
            throw new DukeException("invalid deadline date given.");
        }
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
        return "[D]" + super.toString() + " (by: " + by.format(formatter) + ")";
    }

    @Override
    public String infoToStore() {
        String divider = " | ";
        return "D" +  divider
                + (isDone ? "1" : "0") + divider
                + description + divider
                + by;
    }
}
