import java.util.Scanner;

public class Alphabet {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char[] alphas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int sum = 0;
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for(int j = 0; j < alphas.length;j++){
                if(c == alphas[i]) {
                    System.out.println(c + ":" + (j + 1));
                }
            }
        }
    }
}
