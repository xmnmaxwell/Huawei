import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();  
            byte[] b = s.getBytes();
            for (int i = b.length-1; i >= 0; i--) {
                System.out.print((char)b[i]);
            }
        }                      
    }
}
