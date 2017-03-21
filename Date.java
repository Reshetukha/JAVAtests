
package command;

public class Date implements Command {
    
    @Override
    public void execute(){
        System.out.println(System.currentTimeMillis());
    }
}
