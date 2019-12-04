import java.util.Scanner;
 
/**
 * Author: 王俊超
 * Date: 2015-12-24 10:57
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String reverse = new StringBuilder(input).reverse().toString();
            System.out.println(findMaxSubstring(input, reverse));
        }
 
        scanner.close();
    }
 
    /**
     * Substring问题不光要求下标序列是递增的，还要求每次
     * 递增的增量为1， 即两个下标序列为：
     * < i, i+1, i+2, ..., i+k-1 > 和 < j, j+1, j+2, ..., j+k-1 >
     * 类比Subquence问题的动态规划解法，Substring也可以用动态规划解决，令
     * c[i][j]表示【包含Xi字符】和【Yi字符】的最大Substring的长度，比如
     * X = < y, e, d, f >
     * Y = < y, e, k, f >
     * c[1][1] = 1
     * c[2][2] = 2
     * c[3][3] = 0
     * c[4][4] = 1
     * 动态转移方程为：
     * 如果xi == yj， 则 c[i][j] = c[i-1][j-1]+1
     * 如果xi != yj,  那么c[i][j] = 0
     * 最后求Longest Common Substring的长度等于
     * max{c[i][j],  1 <= i <= n， 1 <= j<= m}
     *
     * @param a
     * @param b
     * @return
     */
    private static int findMaxSubstring(String a, String b) {
 
        int aLen = a.length() + 1;
        int bLen = b.length() + 1;
        int max = 0;
        int x = 0;
 
        // 初始值都为0
        int[][] c = new int[aLen][bLen];
 
        for (int i = 1; i < aLen; i++) {
            for (int j = 1; j < bLen; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = 0;
                }
 
                if (c[i][j] > max) {
                    max = c[i][j];
                }
            }
        }
 
        return max;
    }
}
