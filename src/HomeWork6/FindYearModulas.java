package HomeWork6;

import java.util.Scanner;

public class FindYearModulas {
    public static void main(String[] args) {

        /*
        Write a Java program that takes a year from user and print
        whether that year is a leap year or not.
        Input the year: 2016
        Output :2016 is a leap year
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert any year to find out if it is a leap year or not ");
        int year = scan.nextInt();
        int result1 = year % 4;
        int result2 = year % 100;
        int result3 = year % 400;
        if(result1==0 && result2!=0 || result3==0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year+ " is not leap year");
        }
    }
}
