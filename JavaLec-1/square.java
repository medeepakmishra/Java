import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print( " enter the side of sq:");
        double l =sc.nextDouble();
        double area = l*l;

        System.out.print(" the are of sq in :");
        System.out.println(area);
    }
}
