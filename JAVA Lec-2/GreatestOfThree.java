import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt();

        System.out.print(" enter the value of b:");
        int b = sc.nextInt();

        System.out.print(" enter the fause of c:");
        int c = sc.nextInt();

//        if (a>b && a>c){
//            System.out.println("a is Greatest");
//        } else if (b>=a && b>=c) {
//            System.out.println("b is gteatest");
//
//        } else if (c>=a && c>=b) {
//            System.out.println(" c  is the greatest");
//        }else {
//            System.out.println(" all num are equal");
//        }


        if(a>=b){
          if (a>=c) System.out.println("a");
else System.out.println("c");
        }else {
            if (b>=c ) System.out.println("b");
            else System.out.println("c");
        }
    }
}
