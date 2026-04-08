import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseCode, String courseName, ArrayList <Student> students)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setStudents(students);

    }
    public Course(String courseCode, String courseName)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
    }

    // --- Setters ---
    public void setCourseCode(String courseCode) {
        if (courseCode != null && !courseCode.isBlank())
        {
            this.courseCode = courseCode;
        }
        else
        {
            throw new InvalidDataException("Course Code Cannot Be Empty.");
        }
    }

    public void setCourseName(String courseName) {
        if (courseName != null && !courseName.isBlank())
        {
            this.courseName = courseName;
        }
        else
        {
            throw new InvalidDataException("Course Name Cannot Be Empty.");
        }
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    // ---- Getters ----

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // ---- Methods ----
    public void addStudent(Student s)
    {
        if (s == null)
        {
            throw new InvalidDataException("Cannot Add Uninitialized Student");
        }
        else {
            this.students.add(s);
        }
    }
    public double getClassAverage()
    {
        double sum = 0;
        double count = 0;
        for (Student s : students)
        {
            sum += s.calculateAverage();
            count++;
        }
        return sum / count;
    }
    // Doesn't Account for Two or More Students Having the Exact Same Average Grade
    public Student getTopStudent()
    {
        double max_avg = 0;
        int max_index = 0;
        for (int i = 0; i < students.size(); i++)
        {
            if (max_avg < students.get(i).calculateAverage())
            {
                max_avg = students.get(i).calculateAverage();
                max_index = i;
            }
        }
        return students.get(max_index);
    }
    public String generateGradeReport()
    {
        String s = this.toString(); // Course Code and Name
        for (Student student : students)
        {
            s += student.toString(); // Adds Students one by one, Should Use String Builder for performance reasons
        }
        return s;
    }

    @Override
    public String toString() {
        return String.format("------- Course Code: %s, Course Name: %s -------\n", this.courseCode, this.courseName);
    }
}
