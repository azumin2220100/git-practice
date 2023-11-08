import java.util.Scanner;

public class pra2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.print("名前:");
        String name1 = input.next();

        System.out.print("学籍番号:");
        int num1 = input.nextInt();

        System.out.printf("氏名:%s,学籍番号:b%d" , name1, num1);
    }
}
