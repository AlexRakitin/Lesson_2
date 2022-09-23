import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("Have a good day!");
        System.out.println("Type your name:");
        String InputName = Name.nextLine();
        System.out.println("Your name: " + InputName);
    }
}
