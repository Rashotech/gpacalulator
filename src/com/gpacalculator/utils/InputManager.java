package com.gpacalculator.utils;

import java.util.Scanner;

import static com.gpacalculator.utils.InputValidator.*;

public class InputManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readNumberOfCourses(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidPositiveInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            value = Integer.parseInt(inputValue);

            if (!InputValidator.isValidNumberCourses(value)) {
                continue;
            }

            break;
        }
        return value;
    }

    public static String readCourseCode(String prompt) {
        String courseCode;

        while (true) {
            System.out.print(prompt);
            courseCode = scanner.nextLine();

            if (InputValidator.isValidCourseCode(courseCode)) {
                break;
            }

            System.out.println("Invalid Course Code, Please enter a valid Course Code.");
        }
        return courseCode;
    }

    public static int readCourseScore(String prompt) {
        int courseScore;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidPositiveInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid course score.");
                continue;
            }

            courseScore = Integer.parseInt(inputValue);
            
            if (!InputValidator.isValidCourseScore(courseScore)) {
                System.out.printf("Course Score Should be between %d and %d\n", MIN_COURSE_SCORE, MAX_COURSE_SCORE);
                continue;
            }
            
            break;
        }
        
        return courseScore;
    }

    public static int readCourseUnit(String prompt) {
        int courseUnit;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!isValidPositiveInteger(inputValue)) {
                System.out.println("Invalid input, Please enter a valid course unit.");
                continue;
            }

            courseUnit = Integer.parseInt(inputValue);

            if (!isValidCourseUnit(courseUnit)) {
                System.out.printf("Invalid Input, Maximum Course Unit is %d\n", MAX_COURSE_UNIT);
                continue;
            }

            break;
        }

        return courseUnit;
    }
}
