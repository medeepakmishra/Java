public class reverseSortBubbleSort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(); // move to next line after printing all elements
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 6, 3, 62, 7, 22, 63, 7, 3, 2, 66, 22};
        int n = arr.length;
        print(arr);


        for( int j=1; j<=n-1; j++){
            boolean isSorted = true;
            for (int i=0;i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    isSorted=false;
                    break;
                }

            }
            if (isSorted==true) break;
            for (int i = 0; i <= n - 1-j; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }


        print(arr);
    }
}
