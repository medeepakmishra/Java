import java.util.Arrays;

public class sourtArrayBuiltin {
    public static void main(String[] args) {
        int[] arr = {23, 44, 62, 52, 33, 22, 63, 55};

//         sourt arr
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}