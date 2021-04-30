package com.kaygb;

import java.util.Random;
import java.util.Scanner;

import static com.kaygb.RandNum.randNum;
import static com.kaygb.ResError.resError;
import static com.kaygb.ResRight.resRight;
import static com.kaygb.Mode.gameMode;
import static com.kaygb.StartGame.startGame;

// 启动游戏
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Num Game!");
        while (true){
            if(!startGame()){
                break;
            }
        }
    }
}
