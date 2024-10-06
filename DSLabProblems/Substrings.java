
package DSLabProblems;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner (System.in);
        str= sc.nextLine();
        System.out.println("Enter starting index : ");
        int start= sc.nextInt();
        System.out.println("Enter ending index : ");
        int end = sc.nextInt();
        String newString = " ";
        for(int i =start; i<=end; i++){
            newString += str.charAt(i);
            
            
        }
        System.out.println("Expected subString is :" +newString);
        
    }
           

}
