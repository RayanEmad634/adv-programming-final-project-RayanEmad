import thread.GradeCalculatorTask;
import thread.StudentFileReader;

void main() {
    StudentFileReader fileReader = new StudentFileReader("data/students_1.txt");
    fileReader.start();
    try {
        fileReader.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    GradeCalculatorTask gradeCalculatorTask = new GradeCalculatorTask(fileReader.getStudentsRead());
    Thread thread1 = new Thread(gradeCalculatorTask);
    thread1.start();
    try {
        thread1.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
