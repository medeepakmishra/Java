public class reverseOfNumber {
    public static void main(String[] args) {

        int n = 1286;
        int r=0;
        int sum= 0;

        while (n!=0){
            int d = n%10;
            sum +=d;
            n /=10;

        }
        System.out.println(sum);
        while (n!=0){
            r= 10*r;
            r= r+(n%10);
           n= n/10;

        }
        System.out.println(r);
    }
}
