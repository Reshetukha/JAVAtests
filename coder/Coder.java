/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

/**
 *
 * @author Slava
 */
public class Coder {

    private static String myString;
    private static StringBuilder strbr;
    private static char currentChar;
    private static int kolvo = 0;

    //if (args != null && args[0] != null) {
    /*
     } else {
     System.out.println("Got null");
     }
     */
    public static void main(String[] args) {
        myString = args[0];
        if (myString.length() == 0) {
            System.out.println("");
            return;
        }
        strbr = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            currentChar = myString.charAt(i);
            kolvo++;
            i = count(i);
        }
        if ( kolvo > 0){
            myInsert();
        }
        System.out.println(strbr);
        kolvo = 0;
        currentChar = '\u0000';
    }

    private static void myInsert() {
        strbr.append(currentChar);
        if (kolvo > 1) {
            strbr.append(kolvo);
        }
    }

    private static int count(int i) {
        if (i + 1 < myString.length()) {
            if (myString.charAt(i + 1) == myString.charAt(i)) {
                kolvo++;
                if (kolvo == 9) {
                    myInsert();
                    kolvo = 0;
                    return i + 1;
                }
                i = count(i + 1);
            } else {
                myInsert();
                kolvo = 0;
            }
        }
        return i;
    }
}
