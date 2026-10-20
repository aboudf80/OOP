
package my.classes;

/**
 * Class: Student
 * Description: Represents a student with personal details
 *              and an academic average.
 */
public class Student {

    // Student attributes
    public String name;
    public String id;
    public double avg;

    /**
     * Method: print
     * Input: No parameters; uses the current object's attributes.
     * Output: Displays the student's name, ID, and average.
     */
    public void print() {
        System.out.println("\n");
        System.out.println("name=" + name);
        System.out.println("id=" + id);
        System.out.println("avg=" + avg);
    }

    /**
     * Method: checkAvg
     * Input: No parameters; uses the student's average.
     * Output: Displays whether the student is qualified.
     */
    public void checkAvg() {

        // A student is qualified when the average is 90 or higher.
        if (avg >= 90)
            System.out.println(name + " is Qualified");
        else
            System.out.println(name + " is Not Qualified");
    }
}
