
import java.util.Scanner;


public class checkInArray {
    // public static void main(String[] args) {
        
    //     int []arr = { 1,2,4,5,6,7,8,8};
    //    
    
    //     System.out.println("Enter the number to check it is present in array or not ");
    //     int n = sc.nextInt();
    //     boolean found = false;



    //     for (int i = 0; i < arr.length; i++) {
    //         if(n==arr[i]){
    //            found = true;

    //         } 
           
    //     }

    //     if(found==true){
    //         System.out.println("Element is present in array");
    //     }else{
    //         System.out.println("Element is not present in array");
    //     }
    // };
    

    //  another method 


    public static void main(String[] args) {

       
        
        int []arr = { 1,2,4,5,6,7,8,8};
        Scanner sc = new Scanner(System.in);
       
    
        System.out.println("Enter the number to check it is present in array or not ");
        int n = sc.nextInt();
        int found = -1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==n){
                found =i;
                break;
            }



            
        }

        if(found== -1)System.out.println("element is not present");
        else System.out.println("element is present at index" + found);


        

    }
}
