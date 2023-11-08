import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        int N = 5;
        String[][] garray = new String[2][N];

        garray[0][0] = "B2220100";
        garray[1][0] = "nusi";

        garray[0][1] = "B2220200";
        garray[1][1] = "pass2";

        garray[0][2] = "B2220300";
        garray[1][2] = "pass3";

        garray[0][3] = "B2221450";
        garray[1][3] = "pass4";

        garray[0][4] = "B2222520";
        garray[1][4] = "neko";

        Scanner input = new Scanner(System.in);
        Gakupass gakupass = new Gakupass();

        System.out.print("学籍番号:");
        String trygaku = input.next();
        int target = gakupass.gaku(garray,trygaku,N);

        System.out.print("パスワード:");
        String trypass = input.next();
        boolean target2 = gakupass.pass(garray,trypass,target);

        }
    }

