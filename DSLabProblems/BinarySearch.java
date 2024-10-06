
package DSLabProblems;

import java.util.*;
import static java.util.Arrays.binarySearch;


public class BinarySearch {
    void search()
    { 
        System.out.println("Enter size of the array: ");
        Scanner sc = new Scanner( System.in);

        int n =sc.nextInt();
        int arr[] = new int [n];
        
        for (int i =0; i <arr.length; i++){
            System.out.println("Enter element no: "+(i+1) );
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is :" +Arrays.toString(arr));
        System.out.println("Enter the element to be searched: ");
        int number = sc.nextInt();
        int result = binarySearch(arr, number);
        if (result ==-1){
            System.out.println("Element was not found");    
        }
        else{
            System.out.println("Element was found at index no "+result);
        }
    }
    public static void main(String[] args) {
        BinarySearch ob1 = new BinarySearch();
        ob1.search();
    }
    
}
