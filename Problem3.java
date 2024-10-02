/*
Create a class named 'Student' with String variable 'name' and integer variable 'roll no'. Assign the value 
of roll no as '2' and that of name as "John" by creating an object of the class Student.
 */
package LabReport;

public class Problem3 {
    String name;
    int roll_no;
    
    Problem3(String name, int age){
        this.name = name;
        this.roll_no = roll_no;
    }
    void displayInfo()
    {
        System.out.println("Name = " +name);
        System.out.println("Roll = " +roll_no);
        
        
    }
    
    public static void main(String[] args) {
        Problem2 ob1 = new Problem2("Riad", 27);
        ob1.displayInfo();
        
    }
    
}
