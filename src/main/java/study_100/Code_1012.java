package study_100;

import java.util.Scanner;

public class Code_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float f = sc.nextFloat();
        // 소수6번째자리까지 출력해야하므로 String.format() 사용!
        System.out.println(String.format("%.6f",f));
    }
}
