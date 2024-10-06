
package DSLabProblems;

import java.util.Scanner;

class Stack {
    static final int MAX = 50; // Max size of the ob1
    int top = -1; // Stack starts empty, top is directly initialized here
    int[] arr = new int[MAX]; // Create an array of size MAX during declaration

    // Method to push an element onto the ob1
    void push(int data) {
        if (top == MAX - 1) { // Check if ob1 is full
            System.out.println("Stack is overflow");
            return;
        }
        top++; // Increment top
        arr[top] = data; // Add data to the ob1
        System.out.println(data + " is pushed to stack");
    }

    // Method to pop an element from the ob1
    void pop() {
        if (top == -1) { // Check if ob1 is empty
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(arr[top] + " is popped from stack"); // Pop and decrement top
        top--;
    }

    // Method to display the elements of the ob1
    void display() {
        if (top == -1) { // Check if ob1 is empty
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) { // Display from top to bottom
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack ob1 = new Stack(); // No initialization needed, everything is already set
        ob1.push(10);
        ob1.push(20);
        ob1.push(30);
        ob1.display(); // Show ob1 elements
        ob1.pop();     // Pop the top element
        ob1.display(); // Show ob1 after pop
    }
}
