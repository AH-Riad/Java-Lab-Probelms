/*
Write a Java program to create a class called Animal with a method called makeSound(). Create a 
subclass called Cat that overrides the makeSound() method to bark.
 */
package LabReport;

public class Problem4 {
    void makesound(){
        System.out.println("Animal can make sound");
        
    }

        public static void main(String[] args) {
        Problem4 ob1 = new Problem4();
        ob1.makesound();
        
        cat c2 = new cat();
        c2.makesound();  
    }
}
 class cat extends Problem4{
        @Override
        void makesound(){
            System.out.println("Cat can't bark");
            
        }
        
        
    }

    


