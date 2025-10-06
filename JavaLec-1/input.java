import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter you radius:");
        double r = sc.nextDouble();
        double  a =3.145*r*r;

        System.out.print("area is :");
        System.out.println(a);

    }
}
