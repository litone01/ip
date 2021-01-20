package duke.main;

/**
 * Inherited from Task, used to store information related to tasks of type 'Event'.
 *
 * Events are tasks that start at a specific time and ends at a specific time
 */
public class Event extends Task{
    protected String at;

    /**
     * Constructor for Event class object.
     * @param description event description
     * @param at starting and ending time
     */
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}