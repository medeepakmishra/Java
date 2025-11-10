import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {

int[] arr = {10,40,20,30};

int[]x =arr; // x is shallow copy of arr

int[] deep = Arrays.copyOf(arr, arr.length); // depp copy
        deep[0]= 300;
        System.out.println(arr[0]);
        System.out.println(deep[0]);


    }
}
