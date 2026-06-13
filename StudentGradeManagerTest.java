import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeManagerTest {

    @Test
    void testGradeA() {
        StudentGradeManager.Student s =
                new StudentGradeManager.Student(1, "Test", 95);

        assertEquals("A", s.getGrade());
    }

    @Test
    void testGradeF() {
        StudentGradeManager.Student s =
                new StudentGradeManager.Student(2, "B", 30);

        assertEquals("F", s.getGrade());
    }
}