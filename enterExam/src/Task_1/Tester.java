package Task_1;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        NumSum numStr = new NumSum(str);
        System.out.println(numStr.sum());

    }
}
