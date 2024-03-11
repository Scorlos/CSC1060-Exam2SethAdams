import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();
        System.out.print("Third number: ");
        int num3 = in.nextInt();
        System.out.println("Ticket value: " + greenTicket(num1, num2, num3));
        System.out.print("Small Bars: ");
        num1 = in.nextInt();
        System.out.print("Large bars: ");
        num2 = in.nextInt();
        System.out.print("Goal in pounds: ");
        num3 = in.nextInt();
        System.out.println("Small bars needed (-1 means impossible): " + makeChocolate(num1, num2, num3));
    }

    public static int greenTicket(int a, int b, int c) { //Question 3
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int makeChocolate(int small, int large, int goal) { //Question 4
        large = large * 5;
        while ((large) > goal) {
            large = large - 5;
        }
        int numNeeded = goal % large;
        if (numNeeded > small) {
            return -1;
        } else {
            return numNeeded;
        }
    }
}
