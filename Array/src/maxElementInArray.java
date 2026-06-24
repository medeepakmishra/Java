public class maxElementInArray {
//    method -1
//    public static void main(String[] args) {
//
//        int[]arr = {2,5,7,8,9,10};
//
//        int max_ele = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max_ele){
//                max_ele = arr[i];
//            }
//
//        }
//        System.out.println(max_ele);
//
//    }



//    method 2

    public static void main(String[] args) {


        int []arr = {2,-4,7,2,8,0,3,1,};
        int max = arr[0];


            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max){
                    max = arr[i];

                }


        }
        System.out.println(max);
    }




}
