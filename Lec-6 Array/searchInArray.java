import java.util.Scanner;

public class searchInArray {
    public static void main(String[] args) {
        int[] arr = {23, 44, 62, 52, 33, 22, 63, 55};

//         sourt arr
        print(arr);


    }

    public static void print(int[] arr) {
     int update =0;
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==check){
               update =1;
               System.out.println("ha present at " + i);
               break;
           }

        };
        if(update==1){


        }else {
            System.out.println("present nahi hai");
        }
        System.out.println();
    }
}
