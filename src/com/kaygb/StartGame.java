package com.kaygb;

import java.util.Scanner;

import static com.kaygb.Mode.gameMode;
import static com.kaygb.RandNum.randNum;

public class StartGame {
    public static boolean startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one mode:");
        System.out.println("1: 加法 | 2: 减法 | 3: 成分 | 4: 除法 ");
        int mode = scanner.nextInt();
        if (mode > 4 || mode < 1) {
            System.out.println("错误，请选择正确的模式！");
            return true;
        }
        System.out.println("Please choose how to play:");
        System.out.println("1: 三次错误提示，2,十题连做 ");
        int how = scanner.nextInt();
        if (how < 1 || how > 2) {
            System.out.println("错误，请选择正确的模式！");
            return true;
        }


        if (how == 1) {
            int a = randNum(100);
            int b = randNum(20);
            switch (mode) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        int st = gameMode(a, b, '+');
                        if (st == 1) {
                            break;
                        }
                    }

                    break;
                case 2:
                    if (a < b) { // -
                        int c = a;
                        a = b;
                        b = c;
                    }
                    for (int i = 0; i < 3; i++) {
                        int st = gameMode(a, b, '-');
                        if (st == 1) {
                            break;
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        int st = gameMode(a, b, '*');
                        if (st == 1) {
                            break;
                        }
                    }

                    break;
                case 4:
                    if (b == 0) { // /
                        b = b + 1;
                    }
                    if (a % b != 0) {  // /
                        a = a - a % b;
                    }
                    for (int i = 0; i < 3; i++) {
                        int st = gameMode(a, b, '/');
                        if (st == 1) {
                            break;
                        }
                    }

                    break;
                default:
                    System.out.println("Please input a correct mode number");
            }
        } else {
            while (true){
                int rest=0;
                for (int i = 0; i < 10; i++) {
                    int a = randNum(100);
                    int b = randNum(20);
                    switch (mode) {
                        case 1:
                            rest += gameMode(a, b, '+');
                            break;
                        case 2:
                            if (a < b) { // -
                                int c = a;
                                a = b;
                                b = c;
                            }
                            rest += gameMode(a, b, '-');
                            break;
                        case 3:
                            rest += gameMode(a, b, '*');
                            break;
                        case 4:
                            if (b == 0) { // /
                                b = b + 1;
                            }
                            if (a % b != 0) {  // /
                                a = a - a % b;
                            }
                            rest += gameMode(a, b, '/');
                            break;
                        default:
                            System.out.println("Please input a correct mode number");
                    }
                }
                double zql = (double) rest /10;
                System.out.println("总分为：" + rest*10);
                if (zql < 0.75){
                    System.out.println("正确率低于百分之75，请重做！");
                }else {
                    break;
                }
            }

        }
        System.out.println("Start a new Game?");
        System.out.println("0: no | 1:yes");
        int st = scanner.nextInt();
        while (st != 0 && st != 1) {
            System.out.println("Input Error!");
            System.out.println("Start a new Game?");
            System.out.println("0: no \n1:yes");
        }
        return st != 0;
    }
}
