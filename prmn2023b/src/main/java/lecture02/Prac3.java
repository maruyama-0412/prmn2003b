package lecture02;

import java.util.Scanner;
public class Prac3 {
    public static void main(String[] args) {
        String[][] gakuseki = new String[5][2];

        gakuseki[0][0] = "B2222221";
        gakuseki[0][1] = "abcd";

        gakuseki[1][0] = "B2222222";
        gakuseki[1][1] = "efgh";

        gakuseki[2][0] = "B2222223";
        gakuseki[2][1] = "ijkl";

        gakuseki[3][0] = "B2222224";
        gakuseki[3][1] = "mnop";

        gakuseki[4][0] = "B2222225";
        gakuseki[4][1] = "qrst";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください：");
        String n = scan.next();

        GakusekiAndPassword GAP = new GakusekiAndPassword();
        int index = GAP.hantei_gakuseki(gakuseki,n);
        GAP.hantei_password(gakuseki,index);
    }
}
