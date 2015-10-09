package example.testpack;

/**
 * Created by vitaliy.vorona on 10/6/2015.
 */
public class Main extends Exception {
    public static void main(String args[]) {
        String[] students = {"Shreya", "Joseph"};
        try {
            System.out.println(students[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
        System.out.println("All seems to be well");
        System.out.println("All seems to be well");
        System.out.println("All seems to be well");
        System.out.println("All seems to be well");
    }

    int getInt() {
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e) {
            return 10;
        } finally {
            return 20;
        }
    }
}
