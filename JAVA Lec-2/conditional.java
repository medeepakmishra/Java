import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the num");
        int a = sc.nextInt();
//        System.out.println(a);

        if (a%2==0) {
            System.out.println("then number is even");

        }else{
            System.out.println("the number is odd");
        }


    }

}
