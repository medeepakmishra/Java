import java.util.Scanner;

public class productOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of arr");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int b=1;
        for(int i=0 ; i< arr.length; i++){

            b = b*arr[i];

        }
        System.out.print(b);
    }
}
