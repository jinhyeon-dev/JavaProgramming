import java.util.Scanner;

public class Input10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= numbers[index]) {
                m++;
            }
        }
        System.out.println(numbers[index] + "(은)는 " + m + "번째로 큰 숫자입니다.");
    }
}
