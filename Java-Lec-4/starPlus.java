import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();


        for (int i=1; i<=row; i++){
        for (int j=1; j<=row; j++) {
            if(i==row/2+1 ||j==row/2+1) {
                System.out.print("* ");
            }else System.out.print("  ");
        }
        System.out.println();
    }
}  }
