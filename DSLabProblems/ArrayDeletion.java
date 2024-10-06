
package DSLabProblems;

import java.util.*;

public class ArrayDeletion {
    void deletion(int arr[], int newArr[],int number){
      int index =0;
        for(int i= 0,j=0; i<arr.length; i++){
            if(arr[i]!=number){
                newArr[index++]=arr[i];
            }
    }
        System.out.println("New array is :"+Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]= new int[n];
        int newArr[]= new int[arr.length-1];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element no. : "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter array is : " +Arrays.toString(arr));
        
        ArrayDeletion ob1 = new ArrayDeletion();
        System.out.println("Enter the number you want to delete :");
        int number  = sc.nextInt();
        
        
        ob1.deletion(arr, newArr, number);
    }
}
