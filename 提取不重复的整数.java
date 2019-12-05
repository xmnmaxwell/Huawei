输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(str.next());
        String st = sb.reverse().toString();
        char[] ch = st.toCharArray();
        String jud = "";
        for (int i = 0; i < ch.length ; i++){
            String s1 = String.valueOf(ch[i]);
//          System.out.println(s1);
            if(!jud.contains(s1)){
                jud = jud + s1;
            }
        }
        System.out.println(Integer.parseInt(jud));
    }
}
