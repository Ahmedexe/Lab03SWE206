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

        
    }
}