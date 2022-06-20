package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(maxFinder(19,35));
        System.out.println(maxFinder(20, 40));
        System.out.println(maxFinder(40,25));
        System.out.println(maxFinder(10,35));
        System.out.println(maxFinder(50, 20));


    }



    public static String maxFinder(int age, int temperature) {
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
            return "You can go for a walk";

        else if (age < 20 && temperature >= 0 && temperature <= 28)
            return "You can go for a walk";
        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "You can go for a walk";
        else
            return "stay at home";

    }




    }

















