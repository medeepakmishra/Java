import java.util.Scanner;

public class alfaSquare_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
//        int b = sc.nextInt();;
        for(int i=1; i<=a;i++){
            for (int j=1; j<=a; j++){
                System.out.print((char)(i+64)+" ");

            }
            System.out.println();
            for (int j=1; j<=a; j++){
                System.out.print((char)(i+96)+" ");

            }
            System.out.println();
        }
    }
}
