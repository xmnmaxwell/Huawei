import java.util.*;

public class Main{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         while (scan.hasNext()){
             String str1 = scan.next().toUpperCase();
             char char1 = scan.next().toUpperCase().charAt(0);
             System.out.println(letterCount(str1, char1));
         }
     }
    public static int letterCount(String str1, char char1){
        int count = 0;
        for (char char2 : str1.toCharArray()){
            if (char2 == char1)
                count++;
        }
        return count;
    }
}
