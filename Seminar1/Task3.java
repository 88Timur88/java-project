package Seminar1;
/**
 * 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
 * максимальное количество подряд идущих 1.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int maxCount = getMaxOnes(array);
        // Вариант решения №2
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == 1) {
        //         count++;
        //         // maxCount = maxCount < count ? count : maxCount; // вариант с тернарной переменной
        //         if (maxCount < count) {
        //             maxCount = count;
        //         }
        //     } else {
        //         count = 0;
        //     }
        // }
        System.out.println(maxCount);
    }

    private static int getMaxOnes(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int j : array) {
            if (j == 1) count++;
            else {
            count = 0;
            }
            if (maxCount < count) {
            maxCount = count;
            }
        }
        return maxCount;
    }

}