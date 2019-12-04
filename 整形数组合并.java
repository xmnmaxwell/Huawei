import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){
            int n=Integer.parseInt(line);
            String[] a=br.readLine().split(" ");
            int m=Integer.parseInt(br.readLine());
            String[] b=br.readLine().split(" ");
            TreeSet<Integer> set=new TreeSet<>();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<n;i++){
                set.add(Integer.parseInt(a[i]));
            }
            for(int i=0;i<m;i++){
               set.add(Integer.parseInt(b[i]));
            }
            for(Integer c:set){
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
