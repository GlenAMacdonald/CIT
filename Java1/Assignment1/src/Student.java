/**
 * @author Glen Macdonald
 * @date 17-Feb-2023
 * @version 1.0
 * @decription: Class Student takes in two attributes:
 *      The first a string of the students name
 *      The second a list of integers representing their score for each test
 *   It allows calculation of the total score by adding together all scores and prints the resultant grade.
 */

public class Student {
    private String name;
    private final int MAX_TESTS = 4;
    private int[] testScores;

    public Student(String inName, int[] inTestScores){
        this.name = inName;
        SetTestScores(inTestScores);
    }

    public Student(String inName, String[] inTestScores){
        this.name = inName;
        SetTestScores(inTestScores);
    }

    public void SetTestScores(int[] inTestScores){
        int nTests = Math.min(inTestScores.length,this.MAX_TESTS);

        int[] tempArray = new int[nTests];

        for (int index = 0; index < nTests; index++){
            tempArray[index] = inTestScores[index];
        }

        this.testScores = tempArray;
    }


    public void SetTestScores(String[] strTestScores){
        int nTestScores = strTestScores.length;
        int[] intTestScores = new int[nTestScores];

        for (int index = 0;index < nTestScores; index++) {
            intTestScores[index] = Integer.parseInt(strTestScores[index]);
        }

        SetTestScores(intTestScores);
    }

    public String GetName() {
        return this.name;
    }

    public int[] GetTestScores() {
        return this.testScores;
    }

    public String ToString(){
        String returnString = "";
        returnString += this.name + ", " + this.testScores[0];
        return returnString;
    }

    public int AddScores(){
        int totalScore = 0;
        for (int score: this.testScores){
            totalScore += score;
        }
        return totalScore;
    }

    public String GetGrade() {
        String Grade;
        int score = this.AddScores();

        if (score < 50) {return "Fail";}
        else if (score < 75) {return "Pass";}
        else if (score < 85) {return "Credit";}
        else {return "Distinction";}
    }

    public String calculateGrade() {
        String returnString = this.name + ',' + this.GetGrade();
        return returnString;
    }

    public static void main (String[] args){
        Student Amy = new Student("Amy",new String[] {"1","2","3","4"});
        System.out.println(Amy.GetName());
        System.out.println(Amy.GetTestScores());
        System.out.println(Amy.ToString());
    }
}
