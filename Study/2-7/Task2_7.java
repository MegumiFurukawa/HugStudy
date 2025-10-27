public class Task2_7 {

    public static void main(String[] args) {

    // 問１
        String[] country = {"JAPAN", "AMERICA", "KOREA", "ENGLAND"};

    // 問２
        System.out.println(country.length);

    // 問３
    // ↓↓　以下再度修正しました。　↓↓
        String[] strArray = new String[3];
       
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";


    // 問４
        System.out.println(strArray[2]);

    // 問５
        // int型の配列変数intArrayを宣言し、10, 20, 30, 40, 50,で初期化している。
        int[] intArray = {10, 20, 30, 40, 50};

    // 問６
        // 配列変数intArray１番目の要素と配列変数intArrayの５番目の要素を合計して出力している。
            System.out.println(intArray[0] + intArray[4]);
    }
}