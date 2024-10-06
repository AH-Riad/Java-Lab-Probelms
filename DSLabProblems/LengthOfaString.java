
package DSLabProblems;

import java.util.Scanner;

public class LengthOfaString {
     public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String newString=" ";
        int length=0;
        for(int i =0; i<str.length();i++){
            //newString += str.charAt(i);
            length ++;
            
        }
        System.out.println("Length of the string is :"+ length);
        
    }
}

    

