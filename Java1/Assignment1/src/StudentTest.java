import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void generateStudentWithIntegerArray() {
        Student S1 = new Student("Amy",new int[] {1,2,3,4});
        assertArrayEquals(new int[] {1,2,3,4}, S1.GetTestScores());
        S1.SetTestScores(new int[] {4,3,2,1});
        assertArrayEquals(new int[] {4,3,2,1}, S1.GetTestScores());

        Student S2 = new Student("Amy",new int[] {1,2,3,4,5});
        assertArrayEquals(new int[] {1,2,3,4}, S2.GetTestScores());
        S2.SetTestScores(new int[] {5,4,3,2,1});
        assertArrayEquals(new int[] {5,4,3,2}, S2.GetTestScores());

        Student S3 = new Student("Amy",new int[] {1,2,3});
        assertArrayEquals(new int[] {1,2,3}, S3.GetTestScores());
        S3.SetTestScores(new int[] {5,4,3});
        assertArrayEquals(new int[] {5,4,3}, S3.GetTestScores());
    }

    @Test
    public void generateStudentWithStrArray() {
        Student S1 = new Student("Amy",new String[] {"1","2","3","4"});
        assertArrayEquals(new int[] {1,2,3,4}, S1.GetTestScores());
        S1.SetTestScores(new String[] {"4","3","2","1"});
        assertArrayEquals(new int[] {4,3,2,1}, S1.GetTestScores());

        Student S2 = new Student("Amy",new String[] {"1","2","3","4","5"});
        assertArrayEquals(new int[] {1,2,3,4}, S2.GetTestScores());
        S2.SetTestScores(new String[] {"5","4","3","2","1"});
        assertArrayEquals(new int[] {5,4,3,2}, S2.GetTestScores());

        Student S3 = new Student("Amy",new String[] {"1","2","3"});
        assertArrayEquals(new int[] {1,2,3}, S3.GetTestScores());
        S3.SetTestScores(new String[] {"5","4","3"});
        assertArrayEquals(new int[] {5,4,3}, S3.GetTestScores());
    }

    @Test
    public void calculateStudentTotalScore() {
        Student S1 = new Student("Amy",new int[] {1,1,1,1});
        assertEquals(4,S1.AddScores());
        S1.SetTestScores(new int[] {2,2,2,2});
        assertEquals(8,S1.AddScores());
        S1.SetTestScores(new int[] {2,3,4,5});
        assertEquals(14,S1.AddScores());
    }

    @Test
    public void evaluateStudentGrade() {
        Student S1 = new Student("Amy",new int[] {1,1,1,1});
        assertEquals("Fail",S1.GetGrade());
        S1.SetTestScores(new int[] {50});
        assertEquals("Pass",S1.GetGrade());
        S1.SetTestScores(new int[] {74});
        assertEquals("Pass",S1.GetGrade());
        S1.SetTestScores(new int[] {75});
        assertEquals("Credit",S1.GetGrade());
        S1.SetTestScores(new int[] {84});
        assertEquals("Credit",S1.GetGrade());
        S1.SetTestScores(new int[] {85});
        assertEquals("Distinction",S1.GetGrade());
        S1.SetTestScores(new int[] {100});
        assertEquals("Distinction",S1.GetGrade());
    }

    @Test
    public void testCalculateGrade() {
        Student S1 = new Student("Amy",new int[] {49});
        assertEquals("Amy,Fail",S1.calculateGrade());
        S1.SetTestScores(new int[] {20,20,20,20});
        assertEquals("Amy,Credit",S1.calculateGrade());
        S1.SetTestScores(new int[] {25,25,25,25});
        assertEquals("Amy,Distinction",S1.calculateGrade());
        S1.SetTestScores(new int[] {10,10,10,10});
        assertEquals("Amy,Fail",S1.calculateGrade());
        S1.SetTestScores(new int[] {10,10,10,30});
        assertEquals("Amy,Pass",S1.calculateGrade());

        Student S2 = new Student("Bob",new int[] {49});
        assertEquals("Bob,Fail",S2.calculateGrade());
        S2.SetTestScores(new int[] {20,20,20,20});
        assertEquals("Bob,Credit",S2.calculateGrade());
        S2.SetTestScores(new int[] {25,25,25,25});
        assertEquals("Bob,Distinction",S2.calculateGrade());
        S2.SetTestScores(new int[] {10,10,10,10});
        assertEquals("Bob,Fail",S2.calculateGrade());
        S2.SetTestScores(new int[] {10,10,10,30});
        assertEquals("Bob,Pass",S2.calculateGrade());
    }

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
        assertEquals("Amy", Processor.Students.get(0).GetName());
    }
}