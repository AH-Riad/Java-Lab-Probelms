
package LabReport;
/*
Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass 
called Car that overrides the drive() method to print "Repairing a car" 
*/
public class Problem5 {
    void drive()
    {
        System.out.println("Driving a car");
    }
    
    public static void main(String[] args) {
        Problem5 ob1 = new Problem5();
        ob1.drive();
        
        Car car = new Car();
        car.drive();
        
    }
    
}
class Car extends Problem5{
    @Override
    void drive(){
        System.out.println("Repairing a car");
        
    }
}
