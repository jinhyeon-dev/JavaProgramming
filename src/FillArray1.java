import java.util.Scanner;

public class FillArray1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 1;
        int[][] array = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = cnt++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
