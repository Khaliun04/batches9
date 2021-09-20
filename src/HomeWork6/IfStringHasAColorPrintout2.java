package HomeWork6;

import java.util.Scanner;

public class IfStringHasAColorPrintout2 {
    public static void main(String[] args) {

         /* Using scanner ask user to enter any String value. If this String
        has the color like red or blue with lower case print the red or blue.
                EXAMPLE-1:
        Input: "xxredyy"
        Output: red
        EXAMPLE-2:
        Input: "xbxltue"
        Output: blue
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scan.nextLine();
        if(word.contains("red")){
            System.out.println("Your color is red");
        }
        if(word.contains("blue")){
            System.out.println("Your color is blue");
        }
        else {
            System.out.println("There are no matching word");
        }
    }
}
