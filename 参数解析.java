import java.io.*;
 
    public class Main {
        public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            char [] chars = str.toCharArray();
            int count = 0;
            String [] result = new String[10];
            int m = 0;
            for(int i = 0;i<chars.length;i++) {
                if(chars[i]=='"') {
                    int j = i+1;
                    for(int k = j;k<chars.length;k++) {
                        if(chars[k] == '"') {
                            String s1 = str.substring(j,k-1);
                            count++;
                            result[count-1] = s1;
                        }
                    }
                }
                if(chars[i] == ' ') {
                    String s2 = str.substring(m,i);
                    count++;
                    result[count-1] = s2;
                    m = i+1;
                }
                if(i == chars.length-1) {
                    String s3 = str.substring(m,i+1);
                    count++;
                    result[count-1] = s3;
                }
            }
            System.out.println(count);
            for(int i = 0;i<count;i++) {
                System.out.println(result[i]);
            }
        }
    }
