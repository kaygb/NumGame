package com.kaygb;

import java.util.Scanner;

import static com.kaygb.ResError.resError;
import static com.kaygb.ResRight.resRight;

public class Mode {
    public static int gameMode(int a,int b,char c){
        System.out.println(a + " " + c + " " + b + " = ?");
        Scanner scanner = new Scanner(System.in);
        int st;
        int da=0;
        switch (c){
            case '+':
                da = a+b;
                break;
            case '-':
                da = a-b;
                break;
            case '*':
                da = a*b;
                break;
            case '/':
                da = a/b;
        }
//        while (true){
//            int res = scanner.nextInt();
//            if (res == da){
//                resRight();
//                 st=1;
//                break;
//            }else {
//                resError();
//                st=0;
//            }
//        }
        int res = scanner.nextInt();
            if (res == da){
                resRight();
                 st=1;
            }else {
                resError();
                st=0;
            }
        return st;
    }
}
