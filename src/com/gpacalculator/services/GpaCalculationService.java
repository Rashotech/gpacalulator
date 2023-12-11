package com.gpacalculator.services;

import com.gpacalculator.models.Course;

public class GpaCalculationService {
    private double totalGradeUnits;
    private double totalQualityPoints;

    public GpaCalculationService() {
        totalGradeUnits = 0.0;
        totalQualityPoints = 0.0;
    }

    /**
     * Processes a given course and updates the total grade units and quality points accordingly.
     * @param course The Course object to be processed.
     */
    public void processCourse(Course course) {
        totalGradeUnits += course.getUnits();
        totalQualityPoints += course.calculateQualityPoint();
    }

    /**
     * Calculates the GPA based on the accumulated total quality points and total grade units.
     * @return The calculated GPA.
     */
    public double calculateGPA() {
        double gpa = totalQualityPoints / totalGradeUnits;
        return gpa;
    }
}
