/**
 * @author Glen Macdonald
 * @date 17-Feb-2023
 * @version 1.0
 * @description: Class ProcessStudents reads a given file 'scores.txt', processes all the students scores and writes the results to the output file 'results.txt'.
 */

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProcessStudents {
    private String inputFileName = "/Users/glenmacdonald/IdeaProjects/CIT/Java1/Assignment1/src/scores.txt";
    private String outputFileName = "/Users/glenmacdonald/IdeaProjects/CIT/Java1/Assignment1/src/results.txt";
    private String authorName = "Glen Macdonald";
    private String Heading;
    public ArrayList<Student> Students = new ArrayList<Student>();

    public ProcessStudents() {
//  Deliberately empty constructor
    }

    private void WriteFile() {
        try {
            new FileWriter(this.outputFileName, false).close();
            FileWriter writer = new FileWriter(this.outputFileName);
            this.CreateHeading();
            writer.write(this.Heading);
            for (Student student: this.Students) {
                writer.write(System.getProperty( "line.separator" ));
                writer.write(student.calculateGrade());
            }
            writer.close();
        } catch (Exception ex) {
            System.out.println("Error writing to file " + ex);
        }
    }

    public void ReadFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.inputFileName));
            String inLine = reader.readLine();
            while (inLine != null) {
                Student newStudent = ConvertInputToStudent(inLine);
                this.Students.add(newStudent);
                inLine = reader.readLine();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println("Error reading from file " + ex);
        }
    }

    public Student ConvertInputToStudent(String inputLine){
        String[] splitString = inputLine.split(";");
        String name = splitString[0];
        String[] scores = splitString[1].split(",");
        Student returnStudent = new Student(name,scores);
        return returnStudent;
    }

    private void CreateHeading() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM H:m:s YYYY");
        LocalDateTime now = LocalDateTime.now();
        this.Heading = "Report for " + this.authorName + ' ' + dtf.format(now);
    }

    public static void main(String[] args) {
        ProcessStudents Process = new ProcessStudents();
        Process.ReadFile();
        Process.WriteFile();
    }
}