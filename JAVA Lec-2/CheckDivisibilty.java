import java.util.Scanner;

public class CheckDivisibilty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%3==0 && num%5==0) {
            System.out.println(" div by both");


        } else if (num%3==0) {
            System.out.println("div by -3");
            
        } else if ( num%5==0){
            System.out.println("div by 5");

        } else{
            System.out.println("not diveide by both");
        }

    }
}
