/*问题描述：在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
要求：
实现如下2个通配符：
*：匹配0个或以上的字符（字符由英文字母和数字0-9组成，不区分大小写。下同）
？：匹配1个字符
输入：
通配符表达式；
一组字符串。
输出：
返回匹配的结果，正确输出true，错误输出false
 
te?t*.*
txt12.xls
 
false
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static boolean isMatch(String str1,String str2) {
        str1=str1.replaceAll("\\?", "[0-9a-zA-Z]");//把str1变成正则表达式
        str1=str1.replaceAll("\\*","[0-9a-zA-Z]*");
        str1=str1.replaceAll("\\.", "\\.");
    //  str1=str1.replaceAll("\\","\\");      //  \在java里表示转义，
    //  str1=str1.replaceAll("\\+","\\+");
        if(str2.matches(str1))  return true;   
        return false;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        while((line=br.readLine())!=null) {
            String str1=line;
            String str2=br.readLine();
            System.out.println(isMatch(str1, str2));
        }
    }
}
