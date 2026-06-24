
public class secondLargestInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 2, 44, 66, 7, 9};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if( max <arr[i]){
                max = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max2 && arr[i] != max){
                max2 = arr[i];
            }
            
        }
        System.out.println(max);

        System.out.println(max2);
      
        

    }


}
