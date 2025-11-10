public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {999, 3, 5, 2, 7, 2, 8, 22, 444, 34, 100};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

//        for second max
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondMax && arr[i]!= max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);


    }
}
