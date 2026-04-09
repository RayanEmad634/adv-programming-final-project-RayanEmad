package io;

import model.Student;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileInputService {
    // Normal File I/O ig
    public ArrayList<Student> readStudentFile(String filename)
    {
        ArrayList <Student> students = new ArrayList<>();
        try {
            File studentsFile = new File(filename);
            Scanner reader = new Scanner(studentsFile);
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] info = line.split(",");
                ArrayList <Double> grades = new ArrayList<>();
                for (int i = 2; i < info.length; i++)
                {
                    grades.add(Double.parseDouble(info[i])); // can raise NumberFormatException or NullPointerException
                }
                Student s = new Student(info[0],info[1], grades);
                students.add(s);
            }
            reader.close();
            return students;
        } catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
    // USING THREADS
    public ArrayList<Student> readMultipleFiles(String[] filenames)
    {
        return null;
    }
}
