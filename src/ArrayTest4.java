import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        double[] score = new double[10];
        double max = 0;

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " 학생의 점수를 입력하세요!");
            score[i] = sc.nextDouble();
            if (score[i] > max) {
                max = i;
            }
        }
        System.out.println("가장 높은 점수를 받은 학생은 " + name[(int)max] + "입니다.");
    }
}