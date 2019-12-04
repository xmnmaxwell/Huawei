import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ="";
        while((line=br.readLine())!=null){
            int i;
            int j;
            for(i=0;i<=20;++i)
            {
                for(j=0;j<=100-i;++j)
                {
                    int k = 100-i-j;
                    if((k%3 ==0) && (5*i+3*j+k/3==100))
                        System.out.println(i+" "+j+" "+k);
                }
            }
    
    
        }
    }
    
}
