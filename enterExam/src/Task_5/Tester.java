package Task_5;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Item[] items = new Item[3];
        items[0] = new Item(2,3);
        items[1] = new Item(1,5);
        items[2] = new Item(9,4);

        //Scanner scanner = new Scanner(System.in);
        //int capacity = scanner.nextInt();

        int capacity = 10;
        Safe safe = new Safe(capacity, items);

        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Safe capacity: " + capacity);
        System.out.println("Max value of the safe: "
                                    + safe.maxValue(
                                                safe.getVolumes(),
                                                safe.getValues(),
                                                items.length)
                          );

    }

}
