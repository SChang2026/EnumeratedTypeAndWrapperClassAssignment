/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//1a)  Write a main method that creates an enumeration of the days in the week. 
//Once the enum has been created and the day in the week variables filled, print them all out, but rather than the zero based ordinals, print out the days in the week (1-7).
//1b) Write a main method that creates an enumeration of the months in the year. 
//Once the enum has been created and the month variables filled, print them out, but not with the enum ordinals, but the "month in the year" numbers (1-12).
//2) Write a main method which asks for your CCHS username (including graduation year).
//It must create a string of the username, as well as a string of the year part (use substring method of String object). Recall all the years have a length of 4 characters.
//Use an Integer object to parse the int value of that string. 
//Have the method print your graduation year, as well as say what the year after your graduation year will be by adding 1 to the parsed int value.
//Have it also print "In computer language, you graduate in: " and then the binary string version of your graduation year.

package com.mycompany.enumeratedandwrapperclassassignment;

/**
 *
 * @author SChang2026
 */

import java.util.Scanner;

    
    
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class EnumeratedAndWrapperClassAssignment {
    public static void main(String[] args) {
        // 1a: Print days of the week
        System.out.println("Days of the Week:");
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + ": " + days[i]);
        }

        // 1b: Print months of the year
        System.out.println("\nMonths of the Year:");
        Month[] months = Month.values();
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + ": " + months[i]);
        }

        // 2: Process CCHS username
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your CCHS username (e.g., jdoe2026): ");
        String username = scanner.nextLine();

        // Ensure username is at least 4 characters long
        if (username.length() < 4) {
            System.out.println("Invalid username. Please enter a username with at least 4 characters.");
        } else {
            // Extract the graduation year
            String yearString = username.substring(username.length() - 4);
            int graduationYear = Integer.parseInt(yearString);

            // Print graduation year and the year after
            System.out.println("Your graduation year: " + graduationYear);
            System.out.println("The year after your graduation: " + (graduationYear + 1));

            // Print the graduation year in binary
            String binaryYear = Integer.toBinaryString(graduationYear);
            System.out.println("In computer language, you graduate in: " + binaryYear);
        }

        scanner.close();
    }
}