public class printOnlyNegative {
    public static void main(String[] args) {
        int[] arr = {-3,5,6,2,6,9,-6,-7};
        for (int i=0; i<arr.length; i++){
            if (arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
