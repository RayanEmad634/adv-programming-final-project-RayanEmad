package io;

import model.Course;

public class ReportGenerator {
    public void generateSummaryReport(Course course, String outputFile) // writes to file using PrintWriter
    {
        String header = String.format("==============================================\n" +
                "------------------------ GRADE SUMMARY REPORT ------------------------\n" +
                "==============================================\n");
        header += String.format("Course: %s - %s\nTotal Students: %d\nClass Average: %f", course.)


    }
    public void generateGradeDistribution(Course course, String outputFile) // creates histogram
    {

    }
    public void generateErrorLog(String errorMessage, String logFile) // log errors
    {

    }
}
