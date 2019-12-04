import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = bf.readLine())!=null) {
            String[] ss = str.split("-");
            if(ss[0].equals("joker JOKER")||ss[1].equals("joker JOKER")){
                System.out.println("joker JOKER");
                continue;
            }
            String[] str0 = ss[0].split(" ");
            String[] str1 = ss[1].split(" ");
            for(int i=0;i<str0.length;i++){
                if(str0[i].equals("J")){
                    str0[i] = "11";
                    continue;
                }
                if(str0[i].equals("Q")){
                    str0[i] = "12";
                    continue;
                }
                if(str0[i].equals("K")){
                    str0[i] = "13";
                    continue;
                }
                if(str0[i].equals("A")){
                    str0[i] = "14";
                    continue;
                }
                if(str0[i].equals("2")){
                    str0[i] = "15";
                    continue;
                }
            }
            for(int i=0;i<str1.length;i++){
                if(str1[i].equals("J")){
                    str1[i] = "11";
                    continue;
                }
                if(str1[i].equals("Q")){
                    str1[i] = "12";
                    continue;
                }
                if(str1[i].equals("K")){
                    str1[i] = "13";
                    continue;
                }
                if(str1[i].equals("A")){
                    str1[i] = "14";
                    continue;
                }
                if(str1[i].equals("2")){
                    str1[i] = "15";
                    continue;
                }
            }
            int len1 = str0.length,len2 = str1.length;
            if(len1==4||len2==4){
                if(len1==4&&len2==4){
                    int temp = Integer.parseInt(str0[0])-Integer.parseInt(str1[0]);
                    if(temp>=0){
                        System.out.println(ss[0]);
                        continue;
                    }else{
                        System.out.println(ss[1]);
                        continue;
                    }
                }else if(len1==4){
                    System.out.println(ss[0]);
                    continue;
                }else if(len2==4){
                    System.out.println(ss[1]);
                    continue;
                }
            }
            if(len1!=len2){
                System.out.println("ERROR");
                continue;
            }
            int temp = Integer.parseInt(str0[0])-Integer.parseInt(str1[0]);
            if(temp>=0){
                System.out.println(ss[0]);
                continue;
            }else{
                System.out.println(ss[1]);
                continue;
            }
 
        }
    }
}
