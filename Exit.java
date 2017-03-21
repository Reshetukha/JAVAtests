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
public class Exit implements Command {
    @Override
    public void execute(){
        System.out.println("Goodbye!");
    }
}
