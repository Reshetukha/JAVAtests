/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;

/**
 *
 * @author Slava
 */
public class Decoder {

    /**
     * @param args the command line arguments
     */
    private static int kolNext(int i, String myStr) {
        char nextchar = ' ';
        if (i < myStr.length() - 1) {
            nextchar = myStr.charAt(i + 1);
        }
        if (nextchar >= 50 && nextchar <= 57) {
            return Integer.valueOf(String.valueOf(nextchar));
        }
        return 1;
    }

    public static void main(String[] args) {
        String myStr = args[0];
        //check№1 hh
        for (int i = 0; i < myStr.length() - 1; i++){
            char c = myStr.charAt(i);
            char d = myStr.charAt(i + 1);
            if (c == d){
                System.out.println("");
                return;
            }
        }
        //------------------
        
        //check№2 kolvo > 9:
        for (int i = 0; i < myStr.length() - 1; i++){
            char c = myStr.charAt(i);
            char d = myStr.charAt(i + 1);
            if (c >= 30 && c <= 57 && d >= 30 && d <= 57){
                System.out.println("");
                return;
            }
        }
        //-----------------
        
        //
        char firstchar = myStr.charAt(0);
        if ( firstchar >= 48 && firstchar <= 57){
            System.out.println("");
                return;
        }
        //-----------------
        
        StringBuilder strb = new StringBuilder();
        char curchar;
        int kolvo = 0;
        for (int i = 0; i < myStr.length(); i++) {
            curchar = myStr.charAt(i);
            kolvo = kolNext(i, myStr);
            if (kolvo > 1) {
                i++;
                for (int j = 0; j < kolvo; j++) {
                    strb.append(curchar);
                }
            } else {
                strb.append(curchar);
            }
        }
        //System.out.println("kolvo = " + String.valueOf(kolvo));
        System.out.println(strb);
    }
}
