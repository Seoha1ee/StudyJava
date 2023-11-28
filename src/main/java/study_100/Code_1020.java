package study_100;

import java.util.Scanner;

public class Code_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] pn = sc.next().split("-");
        int f = Integer.parseInt(pn[0]);
        int b = Integer.parseInt(pn[1]);

        System.out.printf("%06d%d",f,b);

    }
}
