package thread;

//• Reads student data from a file
//• Each thread processes ONE file
//• Files contain: studentId, name, and comma separated grades

import exception.InvalidDataException;
import io.FileInputService;
import model.Student;

import java.util.ArrayList;

public class StudentFileReader extends Thread {
    private ArrayList<Student> studentsRead;
    private String filename;
    public ArrayList<Student> getStudentsRead() {
        return studentsRead;
    }

    public StudentFileReader(String filename)
    {
        if (filename == null || filename.isBlank()) {
            throw new InvalidDataException("Empty File Name");
        }
        this.filename = filename;
    }

    @Override
    public void run() {
        FileInputService inputService = new FileInputService();
        studentsRead = inputService.readStudentFile(filename);
    }
}
