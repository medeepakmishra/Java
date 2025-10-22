import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x = sc.nextInt();

        System.out.print("entet the valuseof Y:");
        int y = sc.nextInt();

        if (x==0 && y==0){
            System.out.println(" point is at the origin.");
        } else if (x==0 && y!=0) {

            System.out.println(" point lies on the y-axis.");
        } else if (y==0 && x!=0) {
            System.out.println("point lies on the x-axis.");
        } else if (x>0 && y>0) {
            System.out.println("point is in the 1st Quadrant.");
            
        } else if (x<0 && y>0) {
            System.out.println("point is in the 2nd Quadrant.");
            
        } else if (x<0 && y<0) {
            System.out.println("point is in the 3rd Quadrant.");
            
        } else if (x>0 && y<0) {
            System.out.println("point is in the 4th Quadrant");
            
        }
    }
}
