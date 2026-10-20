/**
 * Name : Ahmad Aboud
 * Class : 50/5 Software
 * Course : Java - OOP
 */
package my.main;

import my.classes.Student;
import java.util.Scanner;

/**
 * Class: TestStudent
 * Description: Tests the Student class by creating two
 *              students, checking their averages, and
 *              exchanging their names.
 */
public class TestStudent {

    /**
     * Method: main
     * Input: Student 2's name, ID, and average from the user.
     * Output: Displays student details and qualification
     *         results, then prints the updated details
     *         after swapping the names.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create two independent Student objects.
        Student s1 = new Student();
        Student s2 = new Student();

        // Initialize the first student with predefined values.
        s1.name = "Ahmad";
        s1.id = "214584562";
        s1.avg = 92.5;

        // Read the second student's details from the user.
        System.out.println("Enter the name of the student s2");
        s2.name = scanner.nextLine();

        System.out.println("Enter the id of the student s2");
        s2.id = scanner.nextLine();

        System.out.println("Enter the average of the student s2");
        s2.avg = scanner.nextDouble();

        // Display the original details of both students.
        s1.print();
        s2.print();

        // Check whether each student meets the required average.
        s1.checkAvg();
        s2.checkAvg();

        // Swap only the names while preserving IDs and averages.
        // The temporary variable prevents losing the original name.
        String s1Temp = s1.name;
        s1.name = s2.name;
        s2.name = s1Temp;

        // Verify the swap by displaying both students again.
        s1.print();
        s2.print();
    }
}
