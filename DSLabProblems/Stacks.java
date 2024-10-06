
package DSLabProblems;

import java.util.*;

public class Stacks {
    int top=-1;
    static final int MAX=50;
    int arr[]= new int[MAX];
    
    void push(int n){
        if (top== MAX-1){
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        arr[top]=n;
        System.out.println(n+" is pushed");
    }
    
    void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return;
        }
        
        System.out.println(arr[top--]+" is poped");
        
    }
    void displayInfo(){
        System.out.print("Elements are :");
        for(int i =top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
         System.out.println("");
    }
    
    public static void main(String[] args) {
        Stacks ob1= new Stacks();
        ob1.push(20);
        ob1.displayInfo();
        ob1.push(30);
        ob1.displayInfo();
        ob1.push(40);
        ob1.displayInfo();
       
        ob1.pop();
        ob1.displayInfo();
        ob1.push(50);
        ob1.displayInfo();

    }
    
}
