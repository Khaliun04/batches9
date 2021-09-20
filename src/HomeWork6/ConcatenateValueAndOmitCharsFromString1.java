package HomeWork6;

import java.util.Scanner;

public class ConcatenateValueAndOmitCharsFromString1 {
    public static void main(String[] args) {


        /* Using scanner ask user to enter to String value and concatenate them
     together then print the result. If both String length is not same then omit
     chars from the longer string so it is the same length as the shorter string.
             After making both string same length then concatenate it.
     EXAMPLE-1:
     String 1: "Cell"
     String 2: "Phone"
     Output: "CellPhon"
     EXAMPLE-2:
     String 1: "Cable"
     String 2: "Mic"
     Output: "CabMic"
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first string");
        String first = scan.nextLine();
        System.out.println("Please enter second string");
        String second = scan.nextLine();

        String ans = first.length()<=second.length() ? first  : second  ;
        if(ans.equalsIgnoreCase(first)){
            int lengthFirst = first.length();
            String minus = second.substring(0, lengthFirst);
            System.out.println(first.concat(minus));
        }else{
            int lengthSecond = second.length();
            String minus = first.substring(0, lengthSecond);
            System.out.println(minus.concat(second));
        }

    }
}
