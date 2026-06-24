public class parsingMethodToArray {
    public static void main(String[] args) {

        int x[]= {10,4,66,2,6};
        change(x);
        System.out.println(x[2]);

    }

    public  static void change(int[] x){
        x[2] =99;
    }

}
