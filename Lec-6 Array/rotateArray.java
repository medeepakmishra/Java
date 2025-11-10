public class rotateArray {
    public static void main(String[] args) {
            int[]arr = { 3,5,3,7,2,8,3,9,22,8,2,4,6,9};
        int d = 3;
        int i=0;
        int j= arr.length-1;



        while (i<d-1){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=arr[i];
            i++;
            j --;
        }
        for (int ele: arr){
            System.out.print(ele);
        }
    }

}
