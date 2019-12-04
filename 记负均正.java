import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line=br.readLine())!=null){
            int N = Integer.parseInt(line);
            int negativeCount=0;
            int positiveCount=0;
            int positiveSum = 0;
            String[] strs = br.readLine().split(" ");
            for(int i=0;i<strs.length;++i){
                int temp = Integer.parseInt(strs[i]);
                if(temp > 0){
                    ++positiveCount;
                    positiveSum += temp;
                }
                else if(temp < 0)
                    ++negativeCount;
            }
            System.out.printf("%d %.1f\n",negativeCount,positiveSum*1.0/positiveCount);
        }
             
    }
     
}
