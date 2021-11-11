package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here5
                System.out.println(generateRandomAge());
        System.out.println(car( generateRandomAge(), 23));
        System.out.println(car(generateRandomAge(), 9));
        System.out.println(car(generateRandomAge(), -20));
        System.out.println(car (generateRandomAge(), 0));
        System.out.println(car (generateRandomAge(), -86));
    }

    public static String car(int ageOfMe, int temperature) {
        if (ageOfMe >= 20 && ageOfMe <= 45 && temperature <= -20 && temperature >= 30) {
            return "Можно идти гулять ";

        }
        else if (ageOfMe <= 20 && temperature > 0 && temperature < 28) {
            return "Можно итди гулять ";
        }
        else if (ageOfMe > 45 && temperature <= -10 && temperature >= 25) {
            return "Можно итди гулять  ";
        }

        else {
            return "Оставайтесь дома";
        }


    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int int_random = rand.nextInt(50);
        return int_random;

    }

}



