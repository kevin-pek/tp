package seedu.address.logic.commands;

import static seedu.address.logic.parser.CliSyntax.PREFIX_EVENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_VENDOR;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;

/**
 * Parent abstract class for view commands. Contains the index of the target to be viewed.
 */
public abstract class ViewCommand extends Command {

    public static final String COMMAND_WORD = "view";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Views the item identified by the index number used in the displayed item list.\n"
            + "Parameters: " + PREFIX_VENDOR + " INDEX or "
            + PREFIX_EVENT + " INDEX (INDEX must be a positive integer)" + "\n"
            + "Example to delete a vendor: " + COMMAND_WORD + " " + PREFIX_VENDOR + " 1" + "\n"
            + "Example to delete an event: " + COMMAND_WORD + " " + PREFIX_EVENT + " 1" + "\n";

    protected final Index targetIndex;

    public ViewCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public final String toString() {
        return new ToStringBuilder(this).add("targetIndex", targetIndex).toString();
    }
}
