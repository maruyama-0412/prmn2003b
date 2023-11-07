package lecture03;

import javax.swing.*;

public class Login {
    String name;
    int num;

    Login(String name,int num){
        this.name = name;
        this.num = num;
    }

    void message(String name_n,int num_n){
        if(name.equals(name_n) && num == num_n){
            System.out.println("ログイン成功!");
        }else{
            System.out.println("ログイン失敗!");
        }
    }
}
