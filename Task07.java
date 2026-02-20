import java.util.Scanner;

public class Task07 {

    public static String reverseString(String text) {
        StringBuilder rev = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            rev.append(text.charAt(i));
        }

        return rev.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}