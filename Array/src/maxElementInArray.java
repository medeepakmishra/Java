public class minElementInArray {
    public static void main(String[] args) {

        int[]arr = {2,5,7,8,9,10};

        int ma_ele = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ma_ele){
                ma_ele = arr[i];
            }

        }
        System.out.println(ma_ele);

    }
}
