
package LabReport;
/*
Problem-o1:  
Design a class named Student that has two private data – student id and score. The class should contain 
a parameterized constructor to initialize its data member and one method to display the information. 
Now write a Java program that will use an array of Student objects to represent information about 3 
students. Your program should take input from the keyboard and display the information of the 3 
students.
package LabReport;
*/
import java.util.*;
public class problem1 {
    private int id ;
    private double score;
    
    problem1(int id, double score) {
        this.id = id;
        this.score = score;
    }
   void displayInfo(){
       System.out.println("Student ID = " +id);
       System.out.println("Score = " +score);
          
    }
    
    public static void main(String[] args) {
        problem1[] student = new problem1[3];
        Scanner sc = new Scanner (System.in);
        for(int i =0; i<3; i++){
            System.out.println("Enter id for student"+(i+1) +":");
            int id = sc.nextInt();
            System.out.println("Enter score for student"+(i+1) +":");
            double score = sc.nextDouble();
            student[i]=new problem1(id,score);
            
           
        }
        System.out.println("Information for all students");
        for ( int i = 0; i <3; i++){
            System.out.println("Student"+(i+1));
            student[i].displayInfo();
            
        }
        
        
        
    }
}

