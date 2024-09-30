/*
 Write a Java program to create a class called "Person" with a name and age attribute. Create two 
 instances of the "Person" class, set their attributes using the constructor, and print their name and age.
 */
package LabReport;

public class Problem2 {
    String name;
    int age;
    
    Problem2(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo()
    {
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);
        
        
    }
    
    public static void main(String[] args) {
        Problem2 ob1 = new Problem2("Riad", 22);
        ob1.displayInfo();
        
    }
    
}
