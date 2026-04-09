import thread.GradeCalculatorTask;
import thread.StudentFileReader;

void main() {
    StudentFileReader fileReader = new StudentFileReader("src/data/students_1.txt");
    fileReader.start();
    try {
        fileReader.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(fileReader.getStudentsRead());

}
