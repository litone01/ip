package duke.command;

import duke.tasklist.TaskList;

/**
 * Lists all tasks in the taskList.
 */
public class ListCommand extends Command{

    /**
     * Constructor.
     */
    public ListCommand() {
    }

    /**
     * Executes the action of adding the task.
     * @return the corresponding results to be printed to user
     */
    @Override
    public String[] execute() {
        return TaskList.getAllTaskListInfo();
    }
}
