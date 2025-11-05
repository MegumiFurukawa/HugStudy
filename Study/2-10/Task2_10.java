public class Task2_10 {
    public static void main(String[] args) {

        // 問1
        String[] fruits = {"みかん", "りんご", "ぶどう", "メロン"};
        

        // 問２
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // 問３
        // int型iに1を代入して初期化。1～50までの数字を横一列に出力し、その後改行している。
        int i = 1;
        while(i <= 50) {
            System.out.print(i);
            i ++;
        }

        System.out.println();

        // 問４
        for (int a = 5; a <= 9; a++) {
            System.out.print(a + "||");

            for (int b = 1; b <= 9; b++) {
                System.out.print(a * b + "|");
            }
            System.out.println();
        }
    }
}
