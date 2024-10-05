package TimeComplexity; // Make sure this matches your project structure

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);  // Create a single Scanner object
        
        int n = sc.nextInt(); // Read first integer

        System.out.println("Enter another integer:");
        int m = sc.nextInt(); // Read second integer         //TIME COMPLEXITY OF THIS CODE WILL BE
                                                             // O(n^2)

        for (int i = 0; i <= n; i++) { // Loop from 0 to n
            System.out.println("Riad loves Jenny");
            for (int j = 0; j <= m; j++) { // Nested loop from 0 to m
                System.out.println("Jenny loves Riad");
            }
        }

        sc.close(); // Close the Scanner object to avoid resource leaks
    }
}
