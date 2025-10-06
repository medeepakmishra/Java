import java.util.Scanner;

public class simpleIntrest {

    public static void main(String[] args) {
        System.out.print(" enter the Priciple amount");
        Scanner p = new Scanner(System.in);
        int principle = p.nextInt();

        System.out.println("Enter the rate:");
        Scanner r = new Scanner(System.in);
        int rate = r.nextInt();

        System.out.println(" enter the time:");
        Scanner t = new Scanner(System.in   );
        int time = t.nextInt();


        int si = time*rate *principle ;
        System.out.println(si/100);
    }
}
