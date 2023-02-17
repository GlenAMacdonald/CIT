import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProcessStudents {
    private String inputFileName = "scores.txt";
    private String outputFileName = "results.txt";
    private String authorName = "Glen Macdonald";
    private String Heading;
    private File outputFile;
    public ArrayList<Student> Students = new ArrayList<Student>();

    public ProcessStudents() {

    }

    private void GenerateFile() throws IOException {
        this.outputFile = new File(this.outputFileName);

        if (this.outputFile.createNewFile()) {
            System.out.println("File created: " + this.outputFile.getName());
        } else {
            System.out.println("File already exists.");
        }
    }

    public void ReadFile() throws IOException {
        File inputFile = new File(this.inputFileName);
        BufferedReader reader = new BufferedReader(new FileReader(this.inputFileName));
        String inLine = reader.readLine();
        while (inLine != null) {
            Student newStudent = ConvertInputToStudent(inLine);
            this.Students.add(newStudent);
            inLine = reader.readLine();
        }
        reader.close();
    }

    public Student ConvertInputToStudent(String inputLine){
        String[] splitString = inputLine.split(";");
        String name = splitString[0];
        String[] scores = splitString[1].split(",");
        Student returnStudent = new Student(name,scores);
        return returnStudent;
    }

    private void CreateHeading() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddd MMM HH:mm:ss YYYY");
        LocalDateTime now = LocalDateTime.now();
        this.Heading = "Report for " + this.authorName + ' ' + dtf.format(now);
    }

    public void main(String[] args) {

        this.CreateHeading();

    }
}