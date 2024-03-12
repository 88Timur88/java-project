package Seminar1;
import java.util.Scanner;

/**
📌 Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
📌 Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”
 */
public class NewScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();
        scanner.close();// можно обойтись и без этого
        System.out.println("Привет," + name);

    }
}