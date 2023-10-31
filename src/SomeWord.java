import java.util.Random;
import java.util.Scanner;

public class SomeWord {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String[] when = {"오늘", "내일", "모레"};
        String[] where = {"옥상", "학교", "화장실", "우리집", "방송실", "기능반"};
        String[] who = {"에스파", "아이브", "엔씨티", "교장선생님", "담임선생님"};
        String[] what = {"춤을 춘다", "울부짖는다", "밥을 먹는다", "공부한다", "시간을 보낸다"};
        String[] how = {"격렬하게", "의기소침하게", "그윽하게", "불평하며"};

        System.out.println("이름을 입력하세요");
        String name = sc.next();

        System.out.println(name + "(은)는 " + when[rnd.nextInt(3)] + ", "
                + where[rnd.nextInt(6)] + "에서 " + who[rnd.nextInt(5)] + "(과)와 함께 "
                + how[rnd.nextInt(4)] + " " + what[rnd.nextInt(5)]);
    }
}
