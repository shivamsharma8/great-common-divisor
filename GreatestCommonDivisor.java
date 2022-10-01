public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first , int second){

        if(first >=10 && second >=10){
            int greaternumber=0;


            for (int i=1;i<=first;i++){

                if(first % i==0 && second % i ==0 ){

                    greaternumber=i;

                }
            }
            return greaternumber;
        }
        return -1;
    }
}
