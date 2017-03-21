
package command;

public class Echo implements Command {
    
    private String msg;
    
    public Echo(String str){
        this.msg = str;
    }

    @Override
    public void execute() {
        System.out.println(msg);
    }
    
}
