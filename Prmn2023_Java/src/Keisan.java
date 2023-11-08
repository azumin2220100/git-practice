public class Keisan {
    int goukei(int[] array){
        int sum = 0;
        for(int i : array){
            sum = sum + i;
        }
        return sum;
    }

    void hantei(int sum){
        System.out.printf("合計値：%d\n",sum);

        if(sum >= 100){
            System.out.println("great!!");
        }else if(sum >= 50){
            System.out.println("big");
        }else if(sum <= 49){
            System.out.println("small");
        }else{
            System.out.println("Error");
        }
    }
}
