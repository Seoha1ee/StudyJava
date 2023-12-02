package study_100;

import java.util.Scanner;

public class Code_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.next().split("");
        System.out.printf("[%s0000]\n",s[0]);
        System.out.printf("[%s000]\n",s[1]);
        System.out.printf("[%s00]\n",s[2]);
        System.out.printf("[%s0]\n",s[3]);
        System.out.printf("[%s]",s[4]);

    }
}
