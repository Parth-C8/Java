package com.company;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease Enter a String: ");
        String input = scanner.nextLine();
        System.out.println("\nEnter your choice of loop: \n1 for while loop\n2 for do while loop");
         String ch = scanner.nextLine();
         if(ch.equals("1")) {
             System.out.println("\nWord Check Using While loop");
             while (!input.equalsIgnoreCase("done")) {
                 if (input.charAt(0) == input.charAt(input.length() - 1)) {
                     System.out.println("\nFirst and last characters are same");
                 } else {
                     System.out.println("\nFirst and last characters are not same");
                 }
             }
         }
         else if(ch.equals("2"))
         {
             System.out.println("\nWord Check Using do while loop");
             do{
                 if (input.charAt(0) == input.charAt(input.length() - 1)) {
                     System.out.println("\nFirst and last characters are same");
                 } else {
                     System.out.println("\nFirst and last characters are not same");
                 }
             }while (!input.equalsIgnoreCase("done"));

         }
    }
}
