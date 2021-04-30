package com.kaygb;
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
