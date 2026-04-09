package io;

import model.Course;

import java.io.IOException;
import java.io.PrintWriter;

public class ReportGenerator {
    public void generateSummaryReport(Course course, String outputFile) // writes to file using PrintWriter
    {
        String header = String.format("==============================================\n" +
                "------------------------ GRADE SUMMARY REPORT ------------------------\n" +
                "==============================================\n");
        header += String.format("Course: %s - %s\nTotal Students: %d\nClass Average: %f"
                , course.getCourseCode(), course.getCourseName(), course.getStudents().size(), course.getClassAverage());
        try (PrintWriter writer = new PrintWriter(outputFile))
        {
            writer.println(header);
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
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
