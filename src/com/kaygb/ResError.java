package com.kaygb;
import static com.kaygb.RandNum.randNum;

public class ResError {
    public static void resError(){
        int s = randNum(4);
        switch (s){
            case 1:
                System.out.println("No.Please try again!");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don’t Give up");
                break;
            case 4:
                System.out.println("Not correct.Keep Tring.");
                break;
            default:
                System.out.println("Wrong! ");
        }
    }
}
