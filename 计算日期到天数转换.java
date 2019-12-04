//
//输入年月日，返回天数
//1-31 2-28 3-31 4-30 5-31 6-30 7-31 8-31 9-30 10-31 11-30 12-31
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static int getAllDay(int year,int month,int day) {
        int[] dayary= {31,28,31,30,31,30,31,31,30,31,30,31};
        //判断闰年
        if(year%4==0) dayary[1]=29;
        int total=0;
        for(int i=0;i<month-1;i++) {
            total+=dayary[i];
        }
        total+=day;
        return total;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        while((line=br.readLine())!=null) {
            String[] lineary=line.split(" ");
            int year=Integer.valueOf(lineary[0]);
            int month=Integer.valueOf(lineary[1]);
            int day=Integer.valueOf(lineary[2]);
            System.out.println(getAllDay(year, month, day));
        }
         
    }
}
