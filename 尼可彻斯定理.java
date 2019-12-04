import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            getRes(n);
        }
    }
  
    public static void getRes(int n) {
        String str = "";
        if (n % 2 == 0) { // n为偶数
            int mid = (int) (Math.pow(n, 3) / n);
            str = (mid - 1) + "+" + (mid + 1);
            int T = n / 2;
            for (int i = 1; i < T; i++) {
                str = (mid - (2 * i) - 1) + "+" + str + "+" + (mid + (2 * i) + 1);
            }
        } else { // n为奇数
            int mid = (int) (Math.pow(n, 3) / n);
            str = mid + "";
            int T = n / 2;
            for (int i = 0; i < T; i++) {
                str = (mid - 2 * (i + 1)) + "+" + str + "+" + (mid + 2 * (i + 1));
            }
        }
        System.out.println(str);
    }
}
