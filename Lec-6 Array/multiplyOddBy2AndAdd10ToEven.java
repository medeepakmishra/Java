import java.util.Arrays;

public class multiplyOddBy2AndAdd10ToEven {
    public static void main(String[] args) {
        int[] arr = {23, 44, 62, 52, 33, 22, 63, 55};

//         sourt arr
        print(arr);

        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           if(i%2==0){
               System.out.print(arr[i]+10+" ");
           }else {
               System.out.print(arr[i]*2+" ");
           }
        }
        System.out.println();
    }
}
