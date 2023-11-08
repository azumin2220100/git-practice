public class Gakupass {
    int gaku(String[][] array, String number, int n){
        for(int i=0; i<n; i++){
            if( number.equals(array[0][i]) ){
                return i;
            }
        }

        System.out.println("error!!");
        System.exit(0);
        return -1;
    }

    boolean pass(String[][] array, String number, int i){
        if( number.equals(array[1][i]) ){
            System.out.println("ログイン完了");
            return true;
        }else{
            System.out.println("不正なアクセス");
            return false;
        }
    }
}
