import java.util.Scanner;

public class LeatOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Enter the value of c:");
        int c = sc.nextInt();


        if (a<b){
            if (b<c){
                System.out.println("a is the smallest");
            }else {
                System.out.println("c is the smallest ");
            }


        }else {
            System.out.println("b is the smallest");
        }
    }
}
