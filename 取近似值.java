import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double d=scanner.nextDouble();
        System.out.println(getReturn(d));
    }
     
    public static int getReturn(double d) {
        int i=(int)d;
        return  (d-i)>=0.5?i+1:i;
    }
     
 
}
