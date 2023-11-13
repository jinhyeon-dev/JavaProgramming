import java.util.Scanner;

public class Braket {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String braketString = sc.next();
        int open = 0;
        int close = 0;
        for(int i = 0; i < braketString.length(); i++) {
            char c = braketString.charAt(i);
            if(c == '(') {
                open++;
            }
            else close++;
        }
        System.out.println(open + ", " + close);
    }
}
