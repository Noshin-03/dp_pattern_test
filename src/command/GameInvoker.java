package command;

public class GameInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        }
    }

    public void cancelCommand() {
        if (command != null) {
            command.cancel();
        }
    }
}
