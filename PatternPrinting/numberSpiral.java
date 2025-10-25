import java.util.Scanner;

import static java.lang.Math.min;

public class numberSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(min(i,j));
            }
            System.out.println();
        }
    }
}
