import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
        
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine())!=null){
            int n = Integer.valueOf(str);
            int min = n;
            int a = 0;
            int b = 0;
            for(int i=2; i<=n/2; i++){
                if(!sushu(i) || !sushu(n-i))
                    continue;
                int temp = Math.abs((n-i-i));
                if(temp < min){
                    min = temp;
                    a = i;
                    b = n-i;
                }
            }
            System.out.println(a+"\n"+b);
        }
        bf.close();
    }
    public static boolean sushu(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
