import java.util.*;
  
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int n = Integer.parseInt(sc.nextLine()); // n 种砝码
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(getNums(n, str1, str2));
        }
        sc.close();
    }
   
    private static int getNums(int n, String str1, String str2) {
        // TODO Auto-generated method stub
        String[] strings1 = str1.split(" ");
        String[] strings2 = str2.split(" ");
        int[] m = new int[n];
        int[] x = new int[n];
        int sum = 0; // 总的重量
        for (int i = 0; i < n; i++) {
            m[i] = Integer.valueOf(strings1[i]); // 每种砝码的重量
            x[i] = Integer.valueOf(strings2[i]); // 每种砝码的数量
            sum += x[i] * m[i];
        }
        boolean[] temp = new boolean[sum+1];
        temp[0] = true;
        temp[sum] = true;
        for (int i = 0; i < n; i++) {//砝码的种类数
            for (int j = 0; j < x[i]; j++) {//每种砝码对应的个数
                for (int k = sum; k >= m[i]; k--) {//总重量往下减
                    if (temp[k - m[i]])//递归思想的应用
                        temp[k] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i <= sum; i++) {
            if (temp[i])
                count++;
        }//找到temp[]为true的，这是可以被称出来的；
        return count;
    }
}
