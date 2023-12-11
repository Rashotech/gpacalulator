package com.gpacalculator.models;

class Grade {
    private char letterGrade;
    private double lowerBoundScore;
    private double upperBoundScore;
    private int gradePoint;

    public Grade(char letterGrade, double lowerBoundScore, double upperBoundScore, int gradePoint) {
        this.letterGrade = letterGrade;
        this.lowerBoundScore = lowerBoundScore;
        this.upperBoundScore = upperBoundScore;
        this.gradePoint = gradePoint;
    }

    /**
     * The predefined grade scale used to determine the grade based on the score.
     */
    private static final Grade[] gradeScale = {
            new Grade('A', 70, 100, 5),
            new Grade('B', 60, 69, 4),
            new Grade('C', 50, 59, 3),
            new Grade('D', 45, 49, 2),
            new Grade('E', 40, 44, 1),
            new Grade('F', 0, 39, 0)
    };

    public int getGradePoint() {
        return gradePoint;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    /**
     * Gets the Grade object corresponding to the provided score.
     * @param score The score for which to determine the grade.
     * @return The Grade object corresponding to the score.
     */
    public static Grade getGradeFromScore(double score) {
        for (Grade grade : gradeScale) {
            if (score >= grade.lowerBoundScore && score <= grade.upperBoundScore) {
                return grade;
            }
        }
        // Default if the score doesn't match any grade
        return gradeScale[gradeScale.length - 1];
    }
}