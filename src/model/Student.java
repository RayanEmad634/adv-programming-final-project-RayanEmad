package model;
import exception.*;

import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList <Double> grades;

    // Constructor to init all attributes
    public Student(String studentId, String name, ArrayList <Double> grades)
    {
        setStudentId(studentId);
        setName(name);
        setGrades(grades);
    }
    // Constructor overload, excludes grade init
    public Student(String studentId, String name)
    {
        setStudentId(studentId);
        setName(name);
    }
    // ------- Setters ---------
    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.isBlank())
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
        double count = 0;
        for (double grade : this.grades)
        {
            sum += grade;
            count++;
        }
        return sum / count;
    }

    // Returns Letter Grade if needed
    public String getLetterGrade() {
        double averageGrade = this.calculateAverage();
        if (averageGrade >= 90)
        {
            return "A";
        } else if (averageGrade >= 80)
        {
            return "B";
        } else if (averageGrade >= 70)
        {
            return "C";
        } else if (averageGrade >= 60)
        {
            return "D";
        } else
        {
            return "F";
        }
    }

    // toString override CAN INCLUDE GRADES LATER
    @Override
    public String toString() {
        String s = String.format("Student ID: %s\n" +
                                "Student Name: %s\n" +
                                "Student Grade Average: %f\n" +
                                "Student Average Grade Letter: %s" ,
                this.studentId,this.name, this.calculateAverage(), this.getLetterGrade());
        return s;
    }
}
