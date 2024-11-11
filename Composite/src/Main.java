import models.Course;
import models.EducationalComponent;
import models.Program;
import models.Subject;

public class Main {
    public static void main(String[] args) {
        EducationalComponent math = new Subject("Math", 20);
        EducationalComponent programming = new Subject("Programming", 24);

        EducationalComponent designCourse = new Course("Design");

        Program program = new Program("VSUET Program");
        program.addNewComponent(math);
        program.addNewComponent(programming);
        program.addNewComponent(designCourse);
        program.print();

        System.out.println("---");

        program.removeComponent(math);
        program.print();
    }
}