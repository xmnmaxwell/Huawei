import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main{
      
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine()) != null){
            int max = 0;
            String res = "";
            int temp = 0;
            int cnt = 0;
            String tstr = "";
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c >= '0' && c <= '9'){
                    if(temp == 0){
                        temp = 1;
                    }
                    tstr += c+"";
                    cnt++;
                    continue;
                }
                else{
                    if(cnt >= max){
                        if(cnt > max){
                            max = cnt;
                            res = tstr;
                        }
                        else{
                            res += tstr;
                        }
                    }
                    temp = 0;
                    cnt = 0;
                    tstr = "";
                }
            }
            if(temp == 1){
                if(cnt >= max){
                    if(cnt > max){
                        max = cnt;
                        res = tstr;
                    }
                    else{
                        res += tstr;
                    }
                }
            }
            System.out.println(res + "," + max);
        }
        bf.close();
    }
}
