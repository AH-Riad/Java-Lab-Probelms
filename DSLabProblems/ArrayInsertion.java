
package DSLabProblems;

//import java.util.Arrays;
import java.util.*;

public class ArrayInsertion { 

    void insertElement(int arr[], int newArr[], int number, int index)
    {
        for(int i = 0; i<arr.length+1; i++){
            if(i<index){
                newArr[i]=arr[i];
            }
            else if(i==index){
                newArr[i]=number;
        }else{
                newArr[i]=arr[i-1];
            }
    }
        System.out.println("New array after insertion :"+Arrays.toString(newArr));
    }
    
    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]= new int[n];
        
        for(int i =0; i<n ; i++){
            System.out.println("Enter element no. :"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:"+Arrays.toString(arr));
        System.out.println("Enter element you want to enter:");
        int number = sc.nextInt();
        System.out.println("Enter index:");
        int index=sc.nextInt();
        
        int newArr[]= new int [arr.length+1];
        
        ArrayInsertion ob1 = new ArrayInsertion();
        ob1.insertElement(arr, newArr,number, index);
        
    }
            
 
   
}

    

