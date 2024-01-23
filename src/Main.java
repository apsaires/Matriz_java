import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insert number of rows:");
        int m = sc.nextInt();
        System.out.println("insert number of columns:");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Insert lookup number:");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("position: " + i + ", " + j);
                    if (j>0) {
                        System.out.println("the left value is: " + mat[i][j - 1]);
                    }
                    if (i>0) {
                        System.out.println("the up value is: " + mat[i - 1][j]);
                    }
                    if (j<n-1) {
                        System.out.println("the right value is: " + mat[i][j + 1]);
                    }
                    if (i<m-1) {
                        System.out.println("the down value is: " + mat[i + 1][j]);
                    }
                }

            }


            sc.close();
        }
    }
}