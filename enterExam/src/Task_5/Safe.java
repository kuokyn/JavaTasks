package Task_5;

public class Safe {

    int capacity;
    Item[] items;

    /**
     * Констурктор класса
     * @param capacity - вместимость сейфа
     * @param items - масиив предметов
     */
    public Safe(int capacity, Item[] items) {
        this.capacity = capacity;
        this.items = items;
    }


    /**
     * Получить ценности предметов
     * @return values - массив полей value у массива предметов
     */
    public int[] getValues(){

        int[] values = new int[items.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = items[i].getValue();
        }
        return values;
    }

    /**
     * Получить объём предметов
     * @return volumes - массив полей volume у массива предметов
     */
    public int[] getVolumes() {

        int[] volumes = new int[items.length];
        for (int i = 0;i < volumes.length; i++){
            volumes[i] = items[i].getVolume();
        }
        return volumes;
    }


    /**
     * Подсчет максимальной вместимой ценности
     * @param volumes - массив объёмов
     * @param values - массив ценнсотей
     * @param n - количество предметов
     * @return int - максимальная вместимость
     */
    public int maxValue(int[] volumes, int[] values, int n) {

        // если нет предметов или вместимости сейфа
        if (n <= 0 || capacity <= 0) {
            return 0;
        }

        // матрица для хранения сумм
        int[][] matrix = new int[n + 1][capacity + 1];

        // заполнение матрицы
        for (int j = 0; j <= capacity; j++) {
            matrix[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (volumes[i - 1] > j) {
                    matrix[i][j] = matrix[i - 1][j];
                } else {
                    matrix[i][j] = Math.max(
                            matrix[i - 1][j],
                            matrix[i - 1][j - volumes[i - 1]] + values[i - 1]);
                }
            }
        }

        return matrix[n][capacity];
    }
}
