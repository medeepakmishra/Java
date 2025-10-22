import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price:");
        int cost = sc.nextInt();

        System.out.print( "enter the Selling Price:");
int selling = sc.nextInt();

if(selling>cost){
    System.out.print("seller has made Profit of :");
    double profit = selling-cost;
    double profitP = (profit/cost)*100.0;
    System.out.println(profitP +"%");
} else if (cost>selling) {

    System.out.print("seller has made a loss of:");

    double loss = cost-selling;

    double lossP = (loss/cost)*100.0;
    System.out.println(lossP +"%");

}else {
    System.out.println("NO profit no loss");
}

    }
}
