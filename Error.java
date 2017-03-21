
package command;

public class Error implements Command {
    @Override
    public void execute(){
        System.out.println("Error");
    }
}
