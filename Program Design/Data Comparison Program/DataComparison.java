// program that computes and compares the class averages of two groups
import java.io.*;
import java.util.*;

class DataComparison { 
    public static void main(String[] args) throws FileNotFoundException{
        String courseID1;
        String courseID2;

        int numOfCourses = 0;

        double av1;
        double av2;
        double gr1av;
        double gr2av;

        Scanner Group1 = new Scanner(new FileReader("Group1.txt"));
        Scanner Group2 = new Scanner(new FileReader("Group2.txt"));

        PrintWriter newFile = new PrintWriter("student.txt");

        gr1av = 0.0;
        gr2av = 0.0;

        newFile.println("Course ID  Group No.  Course Average");

        while(Group1.hasNext() && Group2.hasNext()){
            courseID1 = Group1.next();
            courseID2 = Group2.next();

            if(!courseID1.equals(courseID2)) {
                System.out.println("Error, Course ID does not match!");
                newFile.println("Data Error: Course IDs do not match.");
                newFile.close();
                return;
            }
            else {
                av1 = calculateAverage(Group1);
                av2 = calculateAverage(Group2);
                printResult(newFile, courseID1, 1, av1);
                printResult(newFile, courseID1, 2, av2);
                gr1av += av1;
                gr2av += av2;
                newFile.println();
                numOfCourses++;
            }   
        }

        if(Group1.hasNext() && !Group2.hasNext()) {
            System.out.println("Ran out of Data for group 2 before group 1");
        }
        else if (!Group1.hasNext() && Group2.hasNext()) {
            System.out.println("Ran out of Data for group 1 before group 2");
        }
        else {
            newFile.printf("Avg for Group 1: %.2f%n", gr1av / numOfCourses);
            newFile.printf("Avg for Group 2: %.2f", gr2av / numOfCourses);
        }

        Group1.close();
        Group2.close();
        newFile.close();
    }
    
    public static double calculateAverage(Scanner inp) {
        int score = 0;
        int numOfStudents = 0;
        double totalScore = 0.0;
        double totalAverage = 0.0;

        score = inp.nextInt();

        while(score != -999) {
            totalScore += score;
            numOfStudents++;
            score = inp.nextInt();
        }

        totalAverage = totalScore/numOfStudents;

        return totalAverage;
    }
    public static void printResult(PrintWriter out, String courseId, int groupNo, double avg) {
        if(groupNo == 1) {
            out.print("  " + courseId + "   ");
        } 
        else {
            out.print("        ");
        }
        out.printf("%9d %15.2f%n", groupNo, avg);
    }

}
