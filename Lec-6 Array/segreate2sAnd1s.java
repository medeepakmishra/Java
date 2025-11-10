public class segreate2sAnd1s {
    public static void main(String[] args) {
        // code here
        int numZero = 0;
        int numOne = 0;
        int[]arr = { 0,10,0,1,1,0};

        for(int ele:arr){
            if(ele ==0){
                numZero++;

            }else{
                numOne++;
            }
        }

        for(int i=1; i<=numZero;i++){
            arr[i]=0;

        }

        for(int i=numZero; i<=numOne;i++){
            arr[i]=1;

        }

    }
}
