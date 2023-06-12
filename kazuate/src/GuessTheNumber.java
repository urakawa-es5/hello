package hello.kazuate.src;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int targetNum = 42; // プログラマが設定する数
        int attempts = 5; // 最大試行回数

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < attempts; i++) {
            System.out.println("数を予想してください (2桁の正の整数) : ");
            int guess = scanner.nextInt();

            // 入力が2桁の整数かを確認
            if (guess < 10 || guess > 99) {
                System.out.println("無効な入力です．2桁の正の整数を入力してください．");
                continue;
            }

            if (guess == targetNum) {
                System.out.println("当たり！");
                break;
            } else {
                if (Math.abs(guess - targetNum) > 20) {
                    System.out.println("大きく外れています！");
                } else if (guess < targetNum) {
                    System.out.println("設定された数より小さいです");
                } else {
                    System.out.println("設定された数より大きいです");
                }
            }
        }

        scanner.close();
    }
}