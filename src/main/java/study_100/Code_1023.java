package study_100;

import java.util.Scanner;

public class Code_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.next().split("\\.");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        //System.out.println(a);
        //System.out.println(b);
        System.out.printf("%d\n%d",a,b);
    }
}
