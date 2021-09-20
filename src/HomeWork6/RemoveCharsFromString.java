package HomeWork6;

import java.util.Scanner;

public class RemoveCharsFromString {
    public static void main(String[] args) {


         /* Given a string, if one or both of the first 2 chars is 'x', print the
        string without those 'x' chars, and otherwise print the string
        unchanged.
        "xHi" → "Hi"
        "Hxi" → "Hi"
        "Tesxt" → "Testxt"
         */
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter String value");
        String word = str.nextLine().toLowerCase();

            if (word.charAt(0) == 'x'){
                System.out.println(word.substring(1));
            }
            else if(word.charAt(1) == 'x'){
                System.out.println(word.charAt(0)+word.substring(2));
            }
            else{
                System.out.println(word);
            }
        }

    }

