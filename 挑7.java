import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
         
        while(s.hasNextInt()){
            int num = s.nextInt();
             
            System.out.println(Main.countSeven(num));
        }
    }
     
    public static int countSeven(int num){
        int count = 0;
        for(int i = 7; i <= num; i++){
            if(i % 7 == 0){
                count++;
            }else{
                int temp = i;
                while(temp > 0){
                    if(temp % 10 == 7){
                        count++;
                        break;
                    }else{
                        temp = temp / 10;
                    }                           
                }
             
            }
        }
            
        return count;
    }
}
