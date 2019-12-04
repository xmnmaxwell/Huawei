import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main{
    public static void main(String[] args)throws Exception{
        String s="";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while((s=in.readLine())!=null){
            System.out.println(DD(s));
        }
    }
     
    public static String DD(String s){
            String[] str = s.split("\\.");
            for(int i=0; i<str.length; i++){
                if (Integer.parseInt(str[i])>=0 &&Integer.parseInt(str[i])<=255){
                   continue;
                }else{
                   return "NO";
                }
            }
        return "YES";
    }     
}
