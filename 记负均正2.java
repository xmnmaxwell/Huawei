import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
  
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
          
        while((line=bReader.readLine())!=null) {
            String[] strary=line.split(" ");
            int negnum=0;
            int notnegnum=0;
            int total=0;
            for(int i=0;i<strary.length;i++){
                int x=Integer.valueOf(strary[i]);
                if(x<0) negnum++;
                else {
                    notnegnum++;
                    total+=x;
                }
            }
            System.out.println(negnum);
            System.out.format("%.1f", (float)total/notnegnum);
            System.out.println();
        }
          
  
    }
}
