import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessStudentsTest {
    @Test
    public void processStudentsConvertInputToStudent() {
        ProcessStudents Processor = new ProcessStudents();
        Student Amy = Processor.ConvertInputToStudent("Amy;1,2,3,4");
        assertEquals("Amy",Amy.GetName());
        assertArrayEquals(new int[] {1,2,3,4}, Amy.GetTestScores());
        Student Bob = Processor.ConvertInputToStudent("Bob;4,3,2,1");
        assertEquals("Bob",Bob.GetName());
        assertArrayEquals(new int[] {4,3,2,1}, Bob.GetTestScores());
    }

    @Test
    public void reader() throws IOException {
        ProcessStudents Processor = new ProcessStudents();
        Processor.ReadFile();
        assertEquals("Amy Aardvark", Processor.Students.get(0).GetName());
        assertArrayEquals(new int[] {20,20,20,40}, Processor.Students.get(0).GetTestScores());
        assertEquals("Gretta Gorilla", Processor.Students.get(6).GetName());
        assertArrayEquals(new int[] {18,18,20,29}, Processor.Students.get(6).GetTestScores());
    }
}
