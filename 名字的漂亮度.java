import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
    
public class Main{
    public static void main(String[] args)
        {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int timer = 0;
        boolean flag = true;
        StringBuilder stringBuilder = null;
        try{
            while((line = bufferedReader.readLine()) != null)
                {
                if(flag)
                    {
                    timer = Integer.parseInt(line);
                    flag = false;
                    stringBuilder = new StringBuilder();
                    continue;
                }
                stringBuilder.append(line+',');
                timer--;
                if(timer==0)
                    {
                    flag = true;
                    outPutBeauty(stringBuilder.toString());
                }
            }
        }
        catch(IOException e)
            {
            e.printStackTrace();
        }
    }
    public static void outPutBeauty(String string)
        {
        String[] result = string.split(",");
        for(String tmp:result)
            System.out.println(getBeauty(tmp));
    }
    public static int getBeauty(String name)
        {
        char[] chs = name.toLowerCase().toCharArray();
        int[] target = new int[26];
        for(int i=0;i<chs.length;i++)
            target[chs[i] - 'a']++;
        Arrays.sort(target);
        int res = 0;
        for(int i=25;i>=0;i--)
            res += target[i] *(i+1);
        return res;
    }
}
