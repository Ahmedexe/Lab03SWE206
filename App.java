import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Please Enter The Number of Students");
        Scanner input = new Scanner(System.in);
        
        int numOfStd = input.nextInt();
        input.nextLine();  // Consume the leftover newline

        String[] students = new String[numOfStd];
        System.out.println("Please Enter The Names of the Students");

        for (int i = 0; i < numOfStd; i++) {
            students[i] = input.nextLine();
        }
        input.close();

        randomizer(students, numOfStd);

        
    }

    public static void randomizer(String[] students, int numOfStd) {

        List<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, students);
        
        Collections.shuffle(studentList);
        
        for (int i = 0; i < studentList.size() - 1; i += 2) {
            System.out.println("Group: " + studentList.get(i) + ", " + studentList.get(i + 1));
        }
        
        if (studentList.size() % 2 != 0) {
            System.out.println("Group: " + studentList.get(studentList.size() - 1));
        }
    }
}