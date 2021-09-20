package HomeWork6;

import java.util.Scanner;

public class IFBeginningAndEndSubstringSamePrintWithOutBeginningSubs {
    public static void main(String[] args) {


        /* Given a string, if a length 2 substring appears at both its
        beginning and end, print a string without the substring at the
        beginning, so "HelloHe" yields "lloHe". The substring may overlap
        with itself, so "Hi" yields "". Otherwise, print the original string
        unchanged.
                Example:
        "TestTe" --> print stTe
        "TestTi" --> print TestTi
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word");
        String str = scan.nextLine();
        if(str.substring(0,2).equals(str.substring(str.length()-2))) {
            str = str.substring(2);
            System.out.println(str);
        }else{
            System.out.println(str);
        }
    }

}
