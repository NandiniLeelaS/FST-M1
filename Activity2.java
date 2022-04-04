package activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {
        int[] num = {10, 77, 10, 54, -11, 10};
        int sum10= 0;
        for (int i=0 ; i<num.length; i++){

            if (num[i] == 10){
                sum10= sum10+10;

            }
        }
        if (sum10 == 30){
            System.out.println("Value is 30");
        }

    }
}
