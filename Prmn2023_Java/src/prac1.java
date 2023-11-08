import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        String number = "B22201000";

        Scanner input = new Scanner(System.in);
        Gakuseki gaku = new Gakuseki();
        System.out.print("学籍番号を入力してください。: ");
        String gakuseki = input.next();

        gaku.Ghantei(number,gakuseki);
    }
}
