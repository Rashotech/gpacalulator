package com.gpacalculator.main;

import com.gpacalculator.models.Course;
import com.gpacalculator.services.GpaCalculationService;
import com.gpacalculator.utils.InputManager;

public class GpaCalculator {
    public static void main(String[] args) {
        System.out.println("GPA Calculator");

        int numberOfCourses = InputManager.readNumberOfCourses("Enter the number of Courses: ");
        Course[] courseArray = new Course[numberOfCourses];

        GpaCalculationService gpaCalculationService = new GpaCalculationService();

        for (int i = 0; i < numberOfCourses; i++) {
            Course course = processCourseInput(i);
            // Add the course to the array
            courseArray[i] = course;
            gpaCalculationService.processCourse(course);
        }
        printCourseInfo(courseArray);

        double gpa = gpaCalculationService.calculateGPA();
        System.out.printf("\nYour GPA is = %.2f to 2 decimal places.\n", gpa);
    }

    /**
     * Prints the details and grades of each course in the provided array.
     *
     * @param courseArray The array of courses to be printed.
     */
    private static void printCourseInfo(Course[] courseArray) {
        System.out.println("\nCourse details and grades:\n");

        printTableHeader();
        for (Course course : courseArray) {
            course.printCourseInfo();
        }
        printTableFooter();
    }

    /**
     * Processes input for a single course based on the given index.
     *
     * @param index The index of the course in the loop.
     * @return The Course object containing the entered details.
     */
    private static Course processCourseInput(int index) {
        int count = index + 1;
        System.out.println("\nEnter details for Course #" + count);

        String courseCode = InputManager.readCourseCode("Course Code: ");
        int units = InputManager.readCourseUnit("Units: ");
        double score = InputManager.readCourseScore("Score: ");

        return new Course(courseCode, units, score);
    }

    /**
     * Prints the table header for the course details and grades.
     */
    private static void printTableHeader() {
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
    }

    /**
     * Prints the table footer for the course details and grades.
     */
    private static void printTableFooter() {
        System.out.println("|---------------------------------------------------------------------------------------|");
    }
}