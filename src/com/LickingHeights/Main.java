package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName;
        Scanner keyboard;
        double weight;
        int feet;
        int inches;


        keyboard = new Scanner(System.in);

        System.out.println("What is your weight in pounds: ");
        weight = keyboard.nextFloat();

        System.out.println("What is your height. Feet: ");
        feet = keyboard.nextInt();

        System.out.println("Inches: ");
        inches = keyboard.nextInt();

        double weightInKilos = weight*0.453592;
        double heightInMeters = (((feet*12)+inches)*0.0254);
        double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);

        System.out.println("Your BMI is: "+bmi);






















        



    }
}
