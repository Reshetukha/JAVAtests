/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Slava
 */
public class starter {
    
    public static void main(String[] args){
        /*
        System.out.println("starter");
        String[] a = {" "};
        Command myhelp = new Help();
        myhelp.execute();
        Command myEcho = new Echo("blah blah");
        myEcho.execute();
        Command myDate = new Date();
        myDate.execute();
        Command myExit = new Exit();
        myExit.execute();
        System.out.println("Application");
        */
        //Application.main(null);
        
        String[] a = {"echo", "echotest"};
        Application.main(a);
        //Command.main(a);
    }
}