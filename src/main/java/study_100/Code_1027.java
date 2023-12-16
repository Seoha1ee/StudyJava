package study_100;

import java.util.Scanner;

public class Code_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.next().split("\\.");
        int day = Integer.parseInt(s[2]);
        int month = Integer.parseInt(s[1]);
        int year = Integer.parseInt(s[0]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
