package Seminar1;
// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

public class Task4 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3, 4, 3, 5, 100, 8, 25, 26, 26, 1, 4, 5 };
        int val = 3;
        int start = 0;
        int end = nums.length - 1;

        while (nums[end] == val) {
            end--;
        }
        while (start < end) {
            if (nums[start] == val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            } else {
                start++;
            }
        }

        // Выводим измененный массив nums
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}