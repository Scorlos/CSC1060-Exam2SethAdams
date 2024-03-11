import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = in.nextLine();
        char[] stringArray = stringToArray(input);
        int stringLength = input.length();
        for (int i = 0; i < stringLength; i++) {
            if (i == stringLength - 1) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }
        System.out.print("\nEnter starting number: ");
        int start = in.nextInt();
        System.out.print("Enter ending number: ");
        int end = in.nextInt();
        System.out.print("Enter the amount to step by: ");
        int step = in.nextInt();
        int[] boundArray = generateArrayWithBounds(start, end, step);
        int arrayLength = boundArray.length;
        for (int i = 0; i < arrayLength; i++) {
            if (i == arrayLength - 1) {
                System.out.print(boundArray[i]);
            } else {
                System.out.print(boundArray[i] + ", ");
            }
        }
    }

    public static char[] stringToArray(String input) { //Question 5
        int stringLength = input.length();
        char[] stringArray = new char[stringLength];
        for (int i = 0; i < stringLength; i++) {
            stringArray[i] = input.charAt(i);
        }
        return stringArray;
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) { //Question 6
        int arrayLength = 0;
        int calc = start;
        while (calc < end) {
            calc = calc + step;
            arrayLength++;
        }
        int[] boundArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            boundArray[i] = start;
            start = start + step;
        }
        return boundArray;
    }
}
