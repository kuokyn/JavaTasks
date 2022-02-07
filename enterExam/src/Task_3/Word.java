package Task_3;

public class Word {

    String word;
    int vc;

    /**
     * Конструктор класса
     * @param word - слово
     * @param vc - количество гласных
     */
    public Word(String word, int vc){
        this.word = word;
        this.vc = vc;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", vc=" + vc +
                '}';
    }
}
