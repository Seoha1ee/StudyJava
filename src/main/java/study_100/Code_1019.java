package study_100;

import java.util.Scanner;

public class Code_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = sc.next().split("\\.");

        // 문자열-> 정수로 변환!!!
        int yyyy = Integer.parseInt(a[0]);
        int mm = Integer.parseInt(a[1]);
        int dd = Integer.parseInt(a[2]);

        //System.out.printf("%04d.%02d.%02d",yyyy,mm,dd);
        System.out.printf("%04d.%02d.%02d",yyyy,mm,dd);
    }
}
