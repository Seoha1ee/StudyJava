package study_100;

import java.util.Scanner;

public class Code_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] time = sc.next().split(":");
        int m = Integer.parseInt(time[1]);
        if(m<=9){
            System.out.printf("%1d",m);
        } else
        System.out.printf("%2d",m);
    }
}
