import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        ArrayList<String> set=new ArrayList<String>();
        int num=scan.hasNextLine()?Integer.parseInt(scan.nextLine()):0;
        while(--num>=0&&scan.hasNextLine()){
             set.add(scan.nextLine());
        }
        Collections.sort(set);
        for(String str:set){
            System.out.println(str);
        }
    }
}
