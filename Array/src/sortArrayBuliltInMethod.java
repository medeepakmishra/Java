import java.util.Arrays;
public class sortArrayBuliltInMethod {
    public static void main(String[] args) {

            int[] arr = {4,3,7,2,9,6,-10};
            print(arr);
            Arrays.sort(arr);
            print(arr);


    }

    public  static  void print(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");

        }
        System.out.println();
    }
}
