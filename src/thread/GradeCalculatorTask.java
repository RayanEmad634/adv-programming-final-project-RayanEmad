package thread;

//• Processes grades for a single student .
//• Calculates average and letter grade .
//• Stores result in shared collection

import exception.InvalidDataException;
import model.Student;

import java.util.ArrayList;

public class GradeCalculatorTask implements Runnable{
    // Thread Attributes ONLY USED WHEN THREAD COMPLETES
    private static ArrayList <Double> processedAverageGrades;
    private static ArrayList <String> processedLetterGrades;
    private ArrayList <Student> students;
    private Double averageGrade;
    private String averageGradeLetter;
    public GradeCalculatorTask(ArrayList <Student> students)
    {
        if (students == null || students.isEmpty())
        {
            throw new InvalidDataException("Empty/NULL Student Object Used in Thread Constructor");
        }
        else {
            this.students = students;
        }
    }

    @Override
    public void run() {
        for (Student student : students) {
            processedAverageGrades.add(student.calculateAverage());
            processedLetterGrades.add(student.getLetterGrade());
        }
    }
}
