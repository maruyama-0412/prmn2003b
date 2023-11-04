package lecture02;

public class Keisan {

    int sum(int[]  num){
        int x = 0;
        for (int i : num) {
            x = x + i;
        }
        return x;
    }

    void hantei(int x){
        System.out.println("合計値:"+x);
        if(x >= 100){
            System.out.println("great!!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
