import java.util.Scanner;

public class FillArrayTest3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n을 입력하세요");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int limit = n;
        int row = 0;
        int col = -1;
        int direction = 1;
        int number = 1;

        while (true) {
            if (limit == 0) {
                break;
            }
            for (int i = 0; i < limit; i++) {
                col += direction;
                arr[row][col] = number;
                number++;
            }
            limit--;

            for (int j = 0; j < limit; j++) {
                row += direction;
                arr[row][col] = number;
                number++;
            }
            direction *= -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
