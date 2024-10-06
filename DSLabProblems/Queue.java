
package DSLabProblems;
import java.util.Scanner;
public class Queue {
    
    static final int MAX = 50; // Maximum size of the queue
    int front = -1, rear = -1; // Initialize front and rear
    int[] arr = new int[MAX];  // Array to store queue elements

    // Method to enqueue an element into the queue
    void enqueue(int data) {
        if (rear == MAX - 1) { // Check if the queue is full
            System.out.println("Overflow condition");
            return;
        }
        rear++; // Increment rear
        arr[rear] = data; // Add data to the queue
        System.out.println(data + " is enqueued to queue");
    }

    // Method to dequeue an element from the queue
    void dequeue() {
        if (front == rear) { // Check if the queue is empty
            System.out.println("Underflow condition");
            return;
        }
        front++; // Increment front
        System.out.println(arr[front] + " is dequeued from queue");
    }

    // Method to display the elements of the queue
    void display() {
        if (front == rear) { // Check if the queue is empty
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front + 1; i <= rear; i++) { // Display from front+1 to rear
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Queue queue = new Queue(); // Create a queue object

        queue.enqueue(10); // Enqueue elements
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Display the queue

        queue.dequeue(); // Dequeue an element

        queue.display(); // Display the queue after dequeue
    }
}

    

