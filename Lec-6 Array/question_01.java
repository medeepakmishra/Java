public class question_01 {

     public static void main(String[] args){
        // multiply odd index by 2 and add 10 to the even index 

        int [] arr = {9,8,7,6,5,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            
            if(i%2==0){
                arr[i]= arr[i]*2;
            }
            else{
                arr[i] = arr[i]+ 10;
            }
           
          
          System.out.println(arr[i]);
          System.out.println();
        }
      
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }



      
     }

}