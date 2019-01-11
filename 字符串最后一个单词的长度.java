import java.util.*; //为了添加scanner
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(wordLen(str));
        }
    }
	public static int wordLen(String str){
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--){
            if (str.charAt(i) == ' ')
                continue;
            while (i >=0 && str.charAt(i) != ' '){
                count++;
                i--;
            }
            break;
        }
        return count;
    }
}
