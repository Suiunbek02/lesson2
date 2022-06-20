package com.company;

public class Main {



    public static String getSquare(int age, int temperature) {
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";

        else if (age < 20 && temperature >= 0 && temperature <= 28)
            return "Можно итди гулять";
        else if (age < 45 && temperature >= -10 && temperature <= 25)
            return "Можно итди гулять";
        else
            return "Оставайтесь дома";

    }
    public static void main(String[] args) {

        getSquare(20, 40);
        getSquare(40, 25);
        getSquare(50, 35);
        getSquare(70, 20);
        System.out.println(getSquare(20,40));
        System.out.println(getSquare(40,25));
        System.out.println(getSquare(50,35));
        System.out.println(getSquare(70,20));

    }











}





