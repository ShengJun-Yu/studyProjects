package AlgorithmClass;

/**
 * @author : Bojack
 * @date : Created in 11:23 2022.02.28
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class 螺旋数组 {
    public static void main(String[] args) {
        int n = 6;
        shu s = new shu();
        int[][] method = s.method(n);
        for (int i = 0; i < method.length; i++) {
            for (int j = 0; j < method[i].length; j++) {
                System.out.print(method[i][j]);
            }

        }

    }

    public static class shu {
        public int[][] method(int n) {
            int[][] arr = new int[n][n];
            int c = 1, j = 0;
            while (c <= n * n) {
                for (int i = j; i < n - j; i++)
                    arr[j][i] = c++;
                for (int i = j + 1; i < n - j; i++)
                    arr[i][n - j - 1] = c++;
                for (int i = n - j - 2; i >= j; i--)
                    arr[n - j - 1][i] = c++;
                for (int i = n -j - 2; i > j; i--)
                    arr[i][j] = c++;
                j++;
            }
            return arr;
        }
    }
}
