package lecture02;

import java.util.Scanner;
public class Prac1 {
    public static void main(String[] args) {

        String number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力して下さい。：");
        String gakuseki = scan.next();

        Gakuseki gs = new Gakuseki();
        gs.hantei(number,gakuseki); //学籍番号が一致しているかを判定するメソッド
    }
}
