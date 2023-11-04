package lecture02;

import java.util.Scanner;
public class Prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];

        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < num.length;i++){
            System.out.print("数字" + (i+1) + "つ目:");
            num[i] = scan.nextInt();
            System.out.println();
        }

        Keisan ks = new Keisan();
        int x = ks.sum(num); //合計値を求めるメソッド
        ks.hantei(x); //合計値の判定を行うメソッド
    }
}
