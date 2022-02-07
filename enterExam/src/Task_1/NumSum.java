package Task_1;


public class NumSum {

    private final String inputString;

    /**
     * Конструктор класса
     * @param inputString - входная строка
     */
    public NumSum(String inputString) {
        this.inputString = inputString;
    }

    /**
     * Подсчет суммы цифр в строке
     * @return sum - сумма цифр
     */
    public int sum() {
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++){
            if (Character.isDigit(inputString.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(inputString.charAt(i)));
            }
        }
        return sum;
    }
}
