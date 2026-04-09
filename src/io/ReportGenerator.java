package io;

import model.Course;
import model.Student;

import java.io.IOException;
import java.io.PrintWriter;

public class ReportGenerator {
    public void generateSummaryReport(Course course, String outputFile) {

        int total = course.getStudents().size();

        int A = 0, B = 0, C = 0, D = 0, F = 0;

        for (Student s : course.getStudents()) {
            double g = s.calculateAverage();

            if (g >= 90) A++;
            else if (g >= 80) B++;
            else if (g >= 70) C++;
            else if (g >= 60) D++;
            else F++;

        }

        // percentages (simple way)
        int pA = (A * 100) / total;
        int pB = (B * 100) / total;
        int pC = (C * 100) / total;
        int pD = (D * 100) / total;
        int pF = (F * 100) / total;

        try {
            PrintWriter writer = new PrintWriter("src/reports/" + outputFile);

            writer.println("==============================================");
            writer.println("           GRADE SUMMARY REPORT");
            writer.println("==============================================");

            writer.println("Course: " + course.getCourseCode() + " - " + course.getCourseName());
            writer.println("Total Students: " + total);
            writer.println("Class Average: " + course.getClassAverage());
            writer.println();

            writer.println("Grade Distribution:");
            writer.println("A: " + A + " students (" + pA + "%)");
            writer.println("B: " + B + " students (" + pB + "%)");
            writer.println("C: " + C + " students (" + pC + "%)");
            writer.println("D: " + D + " students (" + pD + "%)");
            writer.println("F: " + F + " students (" + pF + "%)");
            writer.println();

            if (course.getTopStudent() != null) {
                writer.println("Top Student: " +
                        course.getTopStudent().getStudentId() + " - " +
                        course.getTopStudent().getName() + " (" +
                        course.getTopStudent().calculateAverage() + ")");
            }

            writer.println("==============================================");

            writer.close();

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
    public void generateGradeDistribution(Course course, String outputFile) // creates histogram
    {
        return;
    }
    public void generateErrorLog(String errorMessage, String logFile) // log errors
    {
        return;
    }
}
