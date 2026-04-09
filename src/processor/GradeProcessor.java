package processor;
import exception.*;
import java.util.ArrayList;

public abstract class GradeProcessor {
    public abstract String processGrades(ArrayList <Double> grades);

    public void validateGrades(ArrayList<Double> grades)
    {
        if (grades.isEmpty())
        {
            throw new InvalidGradeException("Empty Grades");
        }
        for (Double grade : grades)
        {
            if (grade > 100 || grade < 0)
            {
                throw new InvalidGradeException("List Contains an Invalid Grade");
            }
        }
    }
}
