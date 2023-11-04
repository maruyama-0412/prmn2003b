package lecture02;

import java.util.Arrays;
import java.util.Scanner;
public class GakusekiAndPassword {

     int hantei_gakuseki(String[][] gakuseki,String n) {

         int index = 5;
         for (int i = 0; i < 5; i++) {
             if (gakuseki[i][0].equals(n)) {
                 index = i;
             }
         }
         return index;
     }

     void hantei_password(String[][] gakuseki,int index){

         Scanner scan = new Scanner(System.in);

        if(index == 5){
            System.out.println("error!!");
            System.exit(0);
        }else{
            System.out.print("パスワードを入力してください：");
            String pass = scan.next();
            if(gakuseki[index][1].equals(pass)){
                System.out.println("ログイン完了");
                System.exit(0);
            }else{
                System.out.println("不正なアクセス");
                System.exit(0);
            }
        }
    }
}
