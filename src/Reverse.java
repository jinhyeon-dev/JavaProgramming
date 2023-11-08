import java.util.Scanner;

public class Reverse {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] nums = new int[a];

        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }

        for (int j = a - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
    }
}