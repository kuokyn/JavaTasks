package Task_2;

import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Factorized {

    private final String number;

    /**
     * Констуктор класса
     * @param number - вхождное число
     */
    public Factorized(String number){
        this.number = number;
    }


    /**
     * Проверка на число
     * @return - true/false
     */
    public boolean isInt() {
        try {
            int x = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Разложение числа на простые множители
     */
    public void factorize() {

        if (!isInt()){
            System.err.println("Not integer");
            return;
        }

        int x = abs(Integer.parseInt(number));

        // если 0
        if (x == 0) {
            System.err.println("[zero]");
            return;
        }

        ArrayList<Integer> factors = new ArrayList<>();

        // ищем делители на отрезке [2; sqrt(x)]
        for (int i = 2; i <= sqrt(x); i++) {
            while (x % i == 0) {
                factors.add(i);
                x /= i;
            }
        }

        // если число оказалось простым
        if (x != 1) {
            factors.add(x);
        }

        // если есть множители
        if (!factors.isEmpty()){
            System.out.println(factors);
        }
    }
}
