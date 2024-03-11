import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line for A: ");
        String a = in.nextLine();
        System.out.print("Enter a line for B: ");
        String b = in.nextLine();
        System.out.println(endOther(a, b));
    }

    public static boolean endOther(String a, String b) { //Question 1
        return a.toLowerCase().endsWith(b.toLowerCase());
    }
}