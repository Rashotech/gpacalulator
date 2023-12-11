package com.gpacalculator.utils;

public class InputValidator {
    public static final byte MAX_COURSE_UNIT = 6;
    public static final byte MAX_COURSE_NUMBER = 15;
    public static final byte MIN_COURSE_SCORE = 0;
    public static final byte MAX_COURSE_SCORE = 100;

    /**
     * Checks if the provided course unit is valid.
     * @param courseUnit The course unit to validate.
     * @return True if the course unit is valid; false otherwise.
     */
    public static boolean isValidCourseUnit(int courseUnit) {
        return courseUnit <= MAX_COURSE_UNIT ;
    }

    /**
     * Checks if the number of course is allowed.
     * @param value The value to validate.
     * @return True if valid; false otherwise.
     */
    public static boolean isValidNumberCourses(int value) {
        return value <= MAX_COURSE_NUMBER ;
    }


    /**
     * Checks if the provided course score is within the valid range.
     * @param courseScore The course score to validate.
     * @return True if the course score is valid; false otherwise.
     */
    public static boolean isValidCourseScore(int courseScore) {
        return courseScore >= MIN_COURSE_SCORE && courseScore <= MAX_COURSE_SCORE;
    }

    /**
     * Checks if the provided course code is valid.
     * @param courseCode The course code to validate.
     * @return True if the course code is valid; false otherwise.
     */
    public static boolean isValidCourseCode(String courseCode) {
        String regex = "^[\\p{L}0-9.#]+\\s\\d{3}$";
        return courseCode != null && !courseCode.trim().isEmpty() && courseCode.matches(regex);
    }

    /**
     * Checks if the provided input is a valid positive integer.
     * @param input The input to validate.
     * @return True if the input is a valid positive integer; false otherwise.
     */
    public static boolean isValidPositiveInteger(String input) {
        try {
            int value = Integer.parseInt(input);
            if(value > 0) return true;
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
