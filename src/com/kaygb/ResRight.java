package com.kaygb;

import static com.kaygb.RandNum.randNum;

public class ResRight {
    // 结果正确
    public static void resRight(){
        int s = randNum(4);
        switch (s){
            case 1:
                System.out.println("Verygood!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nicework!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
            default:
                System.out.println( "Right!");
        }
    }
}
