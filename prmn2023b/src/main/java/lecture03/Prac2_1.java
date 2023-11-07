package lecture03;

import java.util.Scanner;

public class Prac2_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("氏名を入力してください：");
        String name1 = scan.nextLine();
        System.out.print("学籍番号をを入力してください：");
        int num = scan.nextInt();

        System.out.println("<入力結果>");
        System.out.println("氏名：" + name1 + ", 学籍番号：" + num);
    }
}
