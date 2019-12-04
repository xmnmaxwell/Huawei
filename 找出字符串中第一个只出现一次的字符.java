import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.next();
            int n=str.length();
            for (int i=0;i<n;i++){
                 
                char ch=str.charAt(i);
                String s=ch+"";
                if ((n-str.replaceAll(s,"").length())==1){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
