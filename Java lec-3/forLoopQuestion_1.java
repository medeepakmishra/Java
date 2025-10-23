import java.util.Scanner;

public class forLoopQuestion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int deep=1; deep<n; deep++){
            System.out.println("deep");
        }
    }
}
