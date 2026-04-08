import java.util.ArrayList;

public abstract class GradeProcessor {
    public abstract String processGrades(ArrayList <Double> grades);

    public boolean validateGrades(ArrayList<Double> grades)
    {
        for (Double grade : grades)
        {
            if (grade > 100 || grade < 0)
            {
                throw new InvalidGradeException("Invalid Grade");
            }
        }
        return true;
    }
}
