
package command;

public class Application {
    public static void main(String[] args){
        if(args != null){
            if (args.length >= 2){
                switch( args[0] ){
                    case "echo":
                        Command myEcho = new Echo(args[1]);
                        myEcho.execute();
                        break;
                    case "date":
                        Command myDate = new Date();
                        myDate.execute();
                        break;
                    default:
                        Command myError = new Error();
                        myError.execute();
                        break;
                }
            } else if (args.length == 1){
                switch( args[0] ){
                    case "help":
                        Command myhelp = new Help();
                        myhelp.execute();
                        break;
                    case "exit":
                        Command myExit = new Exit();
                        myExit.execute();
                        break;
                    default:
                        Command myError = new Error();
                        myError.execute();
                        break;
                }
            } else {
                Command myError = new Error();
                myError.execute();
            }
        } else {
            Command myError = new Error();
            myError.execute();
        }
    }
}
