import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ans = findNumberOf1(n);
            System.out.println(ans);
        }
    }
 
    public static int findNumberOf1(int num) {
        String s = Integer.toBinaryString(num);
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1')ans++;
        }
        return ans;
    }
}
