package Task_4;

public class Banner {

    String num;

    /**
     * Конструктор класса
     * @param num - входное число
     */
    public Banner (String num){
        this.num = num;
    }


    /**
     * Преобразование числа в баннер
     */
    public void convert() {

        char [][] dictionary = dictionary(); // полученный словарь

        StringBuilder str = new StringBuilder(); // для хранения баннера
        int count = 0; // номер строки
        int i = 0; // счетчик
        while (count < 5) { // 5 - высота баннера
            while (i != num.length()) { // пока не прошлись по всем цифрам входного числа
                char l = num.charAt(i);
                int a = Character.getNumericValue(l);
                for (int k = count * 5; k < count * 5 + 5; k++) {
                    if (a == max(toCharacterArray())) { // если цифра является максимальной
                        if (dictionary[a][k] == '*') { // заменяем звездочки на само число
                            dictionary[a][k] = Character.forDigit(max(toCharacterArray()),10);
                        }
                    }
                    str.append(dictionary[a][k]); // записываем в баннер
                }
                i++;
                str.append("\t"); // отступ между цифрами
            }
            i %= num.length(); // проходимся заново для печатания следующих строк
            count++; // следующая строка баннера
            str.append("\n"); // перенос строки баннера
        }

        System.out.println(str); // вывод баннера
    }


    /**
     * Составление словаря символов (цифр)
     * @return dictionary - полученный словарь
     */
    private char[][] dictionary() {

        // "словарь" цифр
        String[] dict = new String[10];
        dict[0] = "******   **   **   ******";
        dict[1] = "  *    *    *    *    *  ";
        dict[2] = "*****    *******    *****";
        dict[3] = "*****    ******    ******";
        dict[4] = "*   **   ******    *    *";
        dict[5] = "******    *****    ******";
        dict[6] = "******    ******   ******";
        dict[7] = "*****    *    *    *    *";
        dict[8] = "******   *******   ******";
        dict[9] = "******   ******    ******";
        int n = dict.length;

        // делаем из массива строк массив массивов из символов
        char[][] dictionary = new char[n][];
        for (int i = 0; i < n; i++) {
            char[] arrayToProc = dict[i].toCharArray();
            dictionary[i] = arrayToProc;
        }

        return dictionary;
    }


    /**
     * Конвертация числа в массив цифр
     * @return intArr - полученный массив цифр
     */
    public int[] toCharacterArray() {

        // делаем из входного числа массив символов
        char[] charArr = num.toCharArray();

        // делаем из массива символов массив цифр
        int[] intArr = new int[charArr.length];
        for (int i=0;i< charArr.length;i++) {
            intArr[i] =  Character.getNumericValue(charArr[i]);
        }

        return intArr;
    }


    /**
     * Нахождение максимального числа в массиве
     * @param intArr - массив чисел
     * @return max - макс.число
     */
    private int max(int[] intArr) {
        int max = intArr[0];
        for (int j : intArr) {
            if (j > max)
                max = j;
        }
        return max;
    }

}
