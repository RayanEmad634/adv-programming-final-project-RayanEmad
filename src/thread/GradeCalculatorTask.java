package thread;

//• Processes grades for a single student .
//• Calculates average and letter grade .
//• Stores result in shared collection

import exception.InvalidDataException;
import model.GradePair;
import model.Student;

import java.util.ArrayList;

public class GradeCalculatorTask implements Runnable{
    // Thread Attributes ONLY USED WHEN THREAD COMPLETES
    private Student student;
    private Double averageGrade;
    private String averageGradeLetter;
    public GradeCalculatorTask(Student student)
    {
        if (student == null)
        {
            throw new InvalidDataException("Empty/NULL Student Object Used in Thread Constructor");
        }
        else {
            this.student = student;
        }
    }

    @Override
    public void run() {

    }
}
