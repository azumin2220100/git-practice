import java.util.Scanner;

public class pra2_2 {
    public static void main(String[] args) {

        String name1 = "札幌太郎";
        int num1 = 2220100;
        Scanner input = new Scanner(System.in);
        Login log = new Login(name1,num1);

        System.out.print("名前を入力してください。:");
        String name2 = input.next();
        System.out.print("学籍番号を入力してください。:");
        int num2 = input.nextInt();
        log.message(name2,num2);
    }
}