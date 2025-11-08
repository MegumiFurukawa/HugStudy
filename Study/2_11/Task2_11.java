public class Task2_11 {
    public static void main(String[] args) {
        // 問１
        int a = 10;
        int b = 3;

        System.out.println("和: " + (a + b));
        System.out.println("差: " + (a - b));
        System.out.println("積: " + (a * b));
        System.out.println("商: " + (a / b));
        System.out.println("余り: " + (a % b));


        // 問２
        int[] evenNumbers = new int[10];
        int index = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int add = sumOddNumbers(numbers);
        System.out.println("奇数の合計: " + add);
        }

        public static int sumOddNumbers(int[] numbers) {
        int add = 0;

        for (int i = 0; i < numbers.length; i++) {

        //問題③ 奇数かどうかの判定をするために、for文で取得したnumberを2で割り、余りが0にならないような条件文(if文)を記載して下さい。
            if(numbers[i] % 2 != 0){
            add += numbers[i];
            }
        }
        return add;
        }
    }

