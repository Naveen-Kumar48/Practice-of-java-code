
import java.util.Scanner; // Fixed import statement

public class Practice2 { // Class name should be PascalCase

    public static void main(String[] args) { // Added main method
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Use nextLine() for multi-word names
        System.out.println("Hello " + name + ", have a good day!");
        sc.close(); // Good practice to close Scanner
    }
}
