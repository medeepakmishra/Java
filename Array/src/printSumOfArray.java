public class printSumOfArray {
    public static void main(String[] args) {

        int[] arr = {4,6,2,7,4};
        int sum = 0;
        int sum_2 = 1;
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
            sum_2 *= arr[i];


        }
        System.out.println(sum);
        System.out.println(sum_2);

    }
}
