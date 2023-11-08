import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Keisan keisan = new Keisan();
        int[] num = new int[5];

        for(int i=0; i<5; i++){
            System.out.printf("数字 %d つめ:" , i+1);
            num[i] = input.nextInt();
            System.out.println("");
        }

        int sum = keisan.goukei(num);
        keisan.hantei(sum);
    }
}
