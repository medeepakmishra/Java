import java.util.Scanner;

public class ToPrintAbsoluteNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number:");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println(num);
        }else {
           int newNum = num*-1;
            System.out.println(newNum);

        }
    }
}
