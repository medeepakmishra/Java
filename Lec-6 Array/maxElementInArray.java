public class maxElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,33,5,2,5,55,66,2,62,7,};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
