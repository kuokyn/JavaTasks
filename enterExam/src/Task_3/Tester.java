package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inpStr = scanner.nextLine(); // требуется ввод кириллицей
        Vowels obj = new Vowels(inpStr);
        System.out.println(Arrays.toString(obj.countVowels()));
        System.out.println(obj.sorted());
        System.out.println(Arrays.toString(obj.upperCase()));

    }

}
