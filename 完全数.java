import java.util.*;
public class Main{
    private static boolean isPerfect(int src){
          int sum = 1;
        for(int i =2;i*i<=src;i++){
            if(src%i==0){
                sum +=i;
                sum+=src/i;
            }
        }
       
        if(sum==src){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int count = 0;
            //1不是完备数，从2开始遍历
            for(int i=2;i<=n;i++){
                if(isPerfect(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
