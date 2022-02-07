package Task_5;

public class Item {

    private final int volume;
    private final int value;

    /**
     * Конструктор класса
     * @param volume - объём предмета
     * @param value - ценность предмета
     */
    public Item(int volume, int value){
        this.volume = volume;
        this.value = value;
    }


    /**
     * Геттер поля value
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Геттер поля volume
     * @return volume
     */
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", value=" + value +
                '}';
    }
}
