package com.gpacalculator.models;

public class Course {
    private String courseCode;
    private int units;
    private double score;

    public Course(String courseCode, int units, double score) {
        this.courseCode = courseCode;
        this.units = units;
        this.score = score;
    }

    /**
     * Calculates the quality point for the course based on the score and units.
     * @return The quality point for the course.
     */
    public double calculateQualityPoint() {
        return Grade.getGradeFromScore(score).getGradePoint() * units;
    }

    /**
     * Prints the course information in a formatted table row.
     */
    public void printCourseInfo() {
        Grade grade = Grade.getGradeFromScore(score);
        System.out.format("| %-27s| %-21s | %-10s | %-19s |\n",
                courseCode , units, grade.getLetterGrade(), grade.getGradePoint());
    }

    public int getUnits() {
        return units;
    }
}
