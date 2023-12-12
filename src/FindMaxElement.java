import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        size = scanner.nextInt();

        if (size > 20) {
            System.out.println("The size is bigger 20");
        }else {
            array = new int[size];
            for (int i = 0; i<array.length ; i++) {
                System.out.print("value " + (i+1) + " : " );
                array[i] = scanner.nextInt();
            }
            System.out.println("Array :");
            for (int i = 0 ; i < array.length ; i++) {
                System.out.print(array[i]);
            }
            int max = array[0];
            int count = 1;
            for (int i = 0; i<array.length ; i++) {
                if (array[i] > max);
                max = array[i];
                count = i + 1;
            }
            System.out.println("the max value is " + max + " and at position " + count);


        }
    }



}
