import java.util.Scanner;

public class Print10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        //정수형 배열, 길이 10의 numbers 선언
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                //numbers 배열의 i번째에 값 입력받기
                numbers[i] = sc.nextInt();

                boolean fine = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == numbers[i]) {
                        fine = true;
                    }
                }
                if (!fine) {
                    //while루프를 빠져나갈 수 있는 코드 작성
                    break;
                } else {
                    System.out.println("중복입니다. 다시입력하세요.");
                }
            }
        }
        System.out.println("입력된 수는 다음과 같습니다.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
