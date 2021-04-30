package com.kaygb;

import java.util.Random;

public class RandNum {
    // 产生指定范围以内的随机数
    public static int randNum(int num){
        Random rand = new Random();

        return rand.nextInt(num) + 1;
    }
}
