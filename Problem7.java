
package LabReport;

/**
Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes 
Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() 
method for each of the three classes.
 */
interface Problem7 {
    void fly_obj();
    
        public static void main(String[] args) {
        Spacecraft spa = new Spacecraft();
        spa.fly_obj();
        
        Aeroplane ar = new Aeroplane();
        ar.fly_obj();
        
        Helicopter hl = new Helicopter();
        hl.fly_obj();
        
    }
         
}

class Spacecraft implements Problem7{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is flying in outer space");
    }
}
class Aeroplane implements Problem7{
    @Override
    public void fly_obj(){
        System.out.println("Aeroplane is flying in the sky");
        
    }
}

class Helicopter implements Problem7{
    @Override
    public void fly_obj()
    {
        System.out.println("Helicopter is hovering in the air");
    }
    
    
}



  