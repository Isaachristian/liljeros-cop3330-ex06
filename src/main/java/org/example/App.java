/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Retirement Calculator
 */

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int age, ageToRetire, yearsTillRetire, yearOfRetiring;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        // Ask age
        System.out.print("What is your current age? ");
        age = scanner.nextInt();
        System.out.print("At what age would you like to retire? ");
        ageToRetire = scanner.nextInt();

        yearsTillRetire = ageToRetire - age;
        yearOfRetiring = year + yearsTillRetire;

        System.out.println("You have " + yearsTillRetire + " Years left until you retire.");
        System.out.println("It's " + year + ", so you can retire in " + yearOfRetiring + ".");

    }
}
