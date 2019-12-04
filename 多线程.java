import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(line);
            for (int i = 0; i < N; i++) {
                sb.append("ABCD");
            }
            System.out.println(sb);
        }
    }
}
