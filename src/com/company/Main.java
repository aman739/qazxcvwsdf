package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(car(15, 23));
        System.out.println(car(11, 23));
        System.out.println(car(23, 9));
        System.out.println(car(48, -20));
        System.out.println(car(45, 0));
    }

    public static String car(int ageOfMe, int temperature) {
        if (ageOfMe >= 20 && ageOfMe <= 45 && temperature <= -20 && temperature >= 30) {
            return "Можно идти гулять ";

        } else if (ageOfMe <= 20 && temperature > 0 && temperature < 28) {
            return "Можно итди гулять ";
        } else if (ageOfMe > 45 && temperature <= -10 && temperature >= 25) {
            return "Можно итди гулять  ";
        } else {
            return "Оставайтесь дома";
        }


    }


}



