package LabReport;

/**
Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called 
addEmployee().
 */
class Problem6 {
void work(){ 
System.out.println("Employee is working"); 
} 
double getSalary(){ 
return 50000.0; 
}
public static void main(String[] args){ 
Problem6 emp = new Problem6(); 
emp.work(); 
System.out.println("Employee Salary: $" + emp.getSalary()); 
HRManager hr=new HRManager(); 
hr.work(); 
hr.addEmployee(); 
System.out.println("HR Manager Salary: $" + hr.getSalary()); 
} 
}

class HRManager extends Problem6{ 
@Override 
void work(){ 
System.out.println("HR Manager is managing human resources"); 
} 
void addEmployee(){ 
System.out.println("HR Manager is adding a new employee"); 
} 
} 

