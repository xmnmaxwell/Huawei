import java.io.*;
   
public class Main{
   
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().toString();
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
   
    }
   
}
