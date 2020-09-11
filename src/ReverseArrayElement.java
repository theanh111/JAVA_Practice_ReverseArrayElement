import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }
        while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // // Cach reverse 1:
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }

// Cach reverse 2:
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }

        System.out.println();
        System.out.printf("%-20s%s", "Reversed array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}