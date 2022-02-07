package Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Vowels {

    private final String sentence;

    /**
     * Конструктор класса
     * @param sentence - входное предложение
     */
    public Vowels(String sentence) {
        this.sentence = sentence;
    }


    /**
     * Подсчет количества гласных в словах предложения
     * @return words - массив слов типа Word
     */
    public Word[] countVowels() {

        String[] splitted = sentence.split(" "); // делим строку на массив слов
        Word[] words = new Word[splitted.length];

        int[] count = new int[splitted.length];

        for (int i = 0;i < splitted.length; i++) {
            count[i] = countInWord(splitted[i]); // количество гласных
            words[i] = new Word(splitted[i], count[i]);
        }

        return words;
    }


    /**
     * Сортировка слов по количеству гласных (убывающая)
     * @return wording - массив слов типа Word
     */
    public ArrayList<Word> sorted() {

        // компаратор для сортировки
        Comparator<Word> comparator = (o1, o2) -> Integer.compare(o2.vc, o1.vc);

        // конвертируем массив в ArrayList
        ArrayList<Word> wording = new ArrayList<>(Arrays.asList(countVowels()));

        // сортировка
        wording.sort(comparator);

        return wording;
    }


    /**
     * Сделать первую гласную букву слова заглавной
     * @return words - массив слов типа Word
     */
    public Word[] upperCase() {

        Word[] words = countVowels();

        // словарь гласных
        char[] vocalArr = new char[]{'а', 'е', 'о', 'у', 'и', 'я', 'ю', 'э', 'ё', 'ы',
                'Ы', 'А', 'Е', 'У', 'О', 'И', 'Я', 'Ю', 'Э', 'Ё'};

        for (Word word : words) {
            boolean flag = false; // отметка о совпадении
            char[] letters = word.word.toCharArray();
            for (int j = 0; j < letters.length; j++) {
                for (char ch2 : vocalArr) {
                    if (letters[j] == ch2) {
                        letters[j] = Character.toUpperCase(letters[j]);
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
            word.word = new String(letters); // делаем строку из массива символов
        }
        return words;
    }


    /**
     * Подсчет гласных в одном слове
     * @param str - слово
     * @return counter - количество гласных
     */
    public int countInWord(String str) {

        int counter = 0;

        //словарь гласных
        char[] vocalArr = new char[]{'а', 'е', 'о', 'у', 'и', 'я', 'ю', 'э', 'ё', 'ы',
                'Ы', 'А', 'Е', 'У', 'О', 'И', 'Я', 'Ю', 'Э', 'Ё'};

        char[] arrayToProc = str.toCharArray();

        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2) { // если есть совпадение, увеличиваем счетчик
                    counter++;
                }
            }
        }

        return counter;
    }
}
