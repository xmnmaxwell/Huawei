import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
   
public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String message=null;
        while((message=br.readLine())!=null){
            int n=Integer.parseInt(message);
            String[] data=br.readLine().split(" ");
            int m=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            for(int i=0;i<data.length;i++){
                arr[i]=Integer.parseInt(data[i]);
            }
            StringBuffer sb=new StringBuffer();
            if(m==0){
                Arrays.sort(arr);
            }else{
                Arrays.sort(arr);
                for(int i=0;i<arr.length/2;i++){
                    int a=arr[i];
                    arr[i]=arr[arr.length-1-i];
                    arr[arr.length-1-i]=a;
                }
            }
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]+" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
