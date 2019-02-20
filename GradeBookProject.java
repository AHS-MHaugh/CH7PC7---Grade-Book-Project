package gradebookproject;
/**
 * Michael Haugh 
 * Project CH7PC7
 * Programming III - AP CS
 * 2-18-19
 */

//Import Scanner and ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookProject {

    public static void main(String[] args) {
        //Declare the ArrayLists for the students' names, scores, and letter grades
        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<ArrayList<Double>> studentScores = new ArrayList<ArrayList<Double>>();
        ArrayList<String> letterGrades = new ArrayList<String>();

        //Declare Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Iterate through the intended length of the ArrayList
        for (int x = 0; x < 5; x++) {
            //Tell user to enter student name
            System.out.print("Enter a student’s name: ");
                //Input student name
		String name = keyboard.next();
            
            //Declare the ArrayList<Double> and calculateLetterGrade
            ArrayList<Double> scores = new ArrayList<Double>();
            String calculateLetterGrade;

            //Iterate through the intended length of the ArrayList
            for (int y = 0; y < 4; y++) {
                //Tell user to enter test scores
                System.out.print("Enter this student's test score: ");
            
                    Double score = keyboard.nextDouble();
                    //Must meet the conditions of an actual test score
                    if (score >= 0 && score <= 100) {
                        //Add each student's scores to the array
                        scores.add(score);
                    }

                    //Add the names and scores to their intended ArrayLists
                    studentNames.add(name);
                    studentScores.add(scores);
                    //Add the calculated letter grade to its intended ArrayList
                    letterGrades.add(calculateLetterGrade(scores));

                }
        }
        
            
    //FUNCTION TO CALCULATE THE LETTER GRADE BASED UPON TEST SCORES
    public String calculateLetterGrade(ArrayList<Double> scores){

        //Declare the average, total, and letterGrade variables
        double average;
        double total = 0;
        String letterGrade;
        //Iterate through the studentScores array and add up all of the values
        for (int x = 0; x < studentScores.size(); x++) {
            total = total + studentScores.get(x);
        }
        //Set the average equal to the total value divided by number of element in the array
        average = total / studentScores.size();

        //Determine the letter grade based upon numeric value of average
        if (average >= 0 || average <= 60) {
            letterGrade = "F";
        } else if (average >= 60 || average <= 69) {
            letterGrade = "D";
        } else if (average > 69 || average <= 79) {
            letterGrade = "C";
        } else if (average > 79 || average <= 89) {
            letterGrade = "B";
        } else if (average > 89 || average <= 100) {
            letterGrade = "A";
        }
        //Return the determined letter grade
        return letterGrade;

    }


//Iterate through the array
for(int x = 0; x < studentNames.size(); x++){
    //Print out the student's name along with their letter grade
System.out.print(studentName.get(x) + " currently has a " +
            	letterGrade.get(x) + ".");       	
       
       	}
	}
}