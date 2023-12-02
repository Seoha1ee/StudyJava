package study_100;

import java.util.Scanner;

public class Code_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s [] = sc.next().split("");
        for (int i = 0; i < s.length; i++) {
            System.out.printf("'%s'\n",s[i]);
        }
    }
}
