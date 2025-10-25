import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i=1; i<=2*n-1; i++){
            System.out.print(" * ");
        }
        System.out.println();
int nsp=1;


        for (int i=1; i<=n-1; i++){// for lines
            for (int j=1; j<=n-i;j++){
                System.out.print(" * "); // for star
            }

            for (int j=1;j<=nsp;j++){ //for space
                System.out.print("  ");

            }
            for (int j=1; j<=n-i;j++){
                System.out.print(" * "); // for star
            }
            nsp+=2;


            System.out.println();
        }


    }
}
