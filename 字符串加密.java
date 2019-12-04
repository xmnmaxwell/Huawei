import java.util.*;
import java.io.*;
  
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=bf.readLine())!=null){
            String str1 = Encrypt(str);
            System.out.println(str1);
            str=bf.readLine();
            String str2=unEncrypt(str);
            System.out.println(str2);
        }
    }
      
    private static String Encrypt(String line){
        char[] cha = line.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<cha.length;i++){
            if (cha[i]>='a'&&cha[i]<='z'){
                if(cha[i]=='z'){
                    sb.append('A');
                }else{
                    sb.append((char)(cha[i]+1-32));
                }
            }else if(cha[i]>='A'&&cha[i]<='Z'){
                if(cha[i]=='Z'){
                    sb.append('a');
                }else{
                    sb.append((char)(cha[i]+32+1));
                }
            }else if(cha[i]>='0'&&cha[i]<='9'){
                if(cha[i]=='9'){
                    sb.append('0');
                }else{
                    sb.append(cha[i]-48+1);
                   // sb.append((char)(cha[i]+1));
                }
            }else{
                sb.append(cha[i]);
            }
        }
        return sb.toString();
    }
      
      
    private static String unEncrypt(String line){
        char[] cha = line.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<cha.length;i++){
            if (cha[i]>='a'&&cha[i]<='z'){
                if(cha[i]=='a'){
                    sb.append('Z');
                }else{
                    sb.append((char)(cha[i]-1-32));
                }
            }else if(cha[i]>='A'&&cha[i]<='Z'){
                if(cha[i]=='A'){
                    sb.append('z');
                }else{
                    sb.append((char)(cha[i]+32-1));
                }
            }else if(cha[i]>='0'&&cha[i]<='9'){
                if(cha[i]=='0'){
                    sb.append('9');
                }else{
                    sb.append(cha[i]-48-1);
                  // System.out.println((char)(cha[i]-1));
                     //System.out.println(cha[i]-48-1);
                }
            }else{
                sb.append(cha[i]);
            }
        }
        return sb.toString();
    }
}    
