import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList <Double> grades;

    // Constructor to init all attributes
    public Student(String studentId, String name, ArrayList <Double> grades)
    {

    }
    // Constructor override excludes grade init
    public Student(String studentId, String name)
    {

    }
    // ------- Setters ---------
    public void setStudentId(String studentId) {
        if (studentId != null && studentId.isBlank())
        {
            this.studentId = studentId;
        }
        else
        {
            throw new InvalidDataException("Student ID Cannot Be Empty.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
        {
            this.name = name;
        }
        else
        {
            throw new InvalidDataException("Student Name Cannot Be Empty.");
        }
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
    // -----------------

    // ---- Getters ----

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
    // ----------------

    // Methods

    // Calculates Average Value of Student Grades
    public double calculateAverage()
    {
        double sum = 0;
        int count = 0;
        for (double grade : this.grades)
        {
            sum += grade;
            count++;
        }
        return sum / (double) count;
    }

    // Returns Letter Grade if needed
    public String getLetterGrade()
    {
        return "A: 90+, B: 80-89, C: 70-79, D: 60-69, F: <60";
    }

    // toString override CAN INCLUDE GRADES LATER
    @Override
    public String toString() {
        String s = String.format("Student ID: %s\nStudent Name: %s", this.studentId,this.name);
        return s;
    }
}
