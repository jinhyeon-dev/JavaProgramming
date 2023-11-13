import java.util.Scanner;

public class Rotation {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.print(nums[j]+ " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(nums[k] + " ");
            }
            System.out.println();
        }
    }

}
