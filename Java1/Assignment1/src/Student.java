
public class Student {
    public String name;
    public final int MAX_TESTS = 4;
    public int[] testScores;

    Student(String inName, int[] inTestScores){
        this.name = inName;

        int nTests = Math.min(inTestScores.length,this.MAX_TESTS);

        int[] tempArray = new int[nTests];

        for (int index = 0; index < nTests; index++){
            tempArray[index] = inTestScores[index];
        }

        this.testScores = tempArray;
    }

    Student(String inName, String[] inTestScores){

    }

    public String calculateGrade(){
        int testScoreSum = 0;

        for (int score:this.testScores){
            testScoreSum += score;
        }

        String returnString = Integer.toString(testScoreSum);

        return returnString;
    }
}
