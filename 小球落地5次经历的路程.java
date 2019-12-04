import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int high=in.nextInt(); 
            System.out.println(getJourney(high));
            System.out.println(getTenthHigh(high));
        }
    }
    public static double getJourney(int high)
    {
        double highSum=0;
        double high1=high;
        for(int i=1;i<=5;i++){
            highSum+=high1+high1/2;
            high1/=2;
        }
        highSum-=high1;
        return highSum;
    }
    public static double getTenthHigh(int high)
    {
        double highSum=0;
        double high1=high;
        for(int i=1;i<=5;i++){
            high1/=2;
        }
 
        return high1;
 
 
    }
}
