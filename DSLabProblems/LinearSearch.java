
package DSLabProblems;

import java.util.*;

public class LinearSearch {
  
     void Search()
     {
       
        System.out.println("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("Enter element no: " +(i+1 ));
            arr[i] = sc.nextInt();
                    
            
        }
         System.out.println("Entered array is " +Arrays.toString(arr) );
        
        System.out.println("Entrer the element to be searched :");
        Scanner s1 = new Scanner (System.in);
        int number = s1.nextInt();
        
        boolean found = false;
        for (int i = 0; i<arr.length; i++){
             if(arr[i]== number){
                System.out.println("Number was  found at index " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            
            System.out.println("Element was not found");   
        }
       
     }
         
      
    public static void main(String[] args) {
                
        LinearSearch ob1 = new LinearSearch();
        ob1.Search();
        
        
       
    }
    
}
