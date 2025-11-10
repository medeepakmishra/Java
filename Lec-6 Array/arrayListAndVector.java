import java.util.ArrayList;

public class arrayListAndVector {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(21);
        arr.add(3);
        arr.add(23);
        arr.add(53);
        arr.set(2,44);

        int n = arr.size(); // ye arr ki length ka kam karta hai

        System.out.println(arr.get(2));
        System.out.println(arr);
    }

}
