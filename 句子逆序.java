import java.util.*;
public class Main{
    public static void main(String[] args)
        {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String res=reverse(str);
        System.out.println(res);
    }
    public static String reverse(String str)
        {
        String[] s=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>0;i--)
            {
            sb.append(s[i]);
            sb.append(" ");
        }
        sb.append(s[0]);
        return sb.toString();
    }
}
