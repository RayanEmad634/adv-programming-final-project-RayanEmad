import io.FileInputService;
import io.ReportGenerator;
import model.Course;
import thread.GradeCalculatorTask;
import thread.StudentFileReader;

void main() {
    String[] filenames = {"src/data/students_1.txt", "src/data/students_2.txt", "src/data/students_3.txt"};
    FileInputService fileInputService = new FileInputService();
    Course course = new Course("CS244", "Advanced Programming", fileInputService.readMultipleFiles(filenames));
    ReportGenerator reportGenerator = new ReportGenerator();
    reportGenerator.generateSummaryReport(course, "1.txt");

}
