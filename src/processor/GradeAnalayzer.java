package processor;

import model.Student;

import java.util.ArrayList;

public class GradeAnalayzer extends GradeProcessor {
    @Override
    public String processGrades(ArrayList<Double> grades) {
        validateGrades(grades);
        // TO DO: TMRW HIGHEST GRADE, LOWEST GRADE, AVERAGE GRADE, STANDARD DEVIATION
        String s = "";
        double min = grades.getFirst();
        double max = grades.getFirst();
        double sum = 0;
        double count = 0;
        // max,min,avg
        for (Double grade : grades)
        {
            if (max < grade)
            {
                max = grade;
            }
            if (min > grade)
            {
                min = grade;
            }
            sum += grade;
            count++;
        }
        double avg = sum / count;
        double standardDeviationSum = 0;
        for (Double grade : grades)
        {
            standardDeviationSum += Math.pow(grade - avg, 2); // (x-x(avg))^2
        }
        double standardDeviation = Math.sqrt(standardDeviationSum/count);
        return String.format("Highest Grade: %f, Lowest Grade: %f, Average Grade: %f, Standard Deviation: %f"
                , max,min,avg,standardDeviation);
    }
}
