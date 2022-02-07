package Task_2;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inpNum = scanner.nextLine();
        Factorized num = new Factorized(inpNum);
        num.factorize();
    }

}
