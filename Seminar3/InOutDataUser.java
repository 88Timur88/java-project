package Seminar3;

import java.util.LinkedList;
import java.util.Scanner;

public class InOutDataUser {

    public static void inOutDataUser() {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку вида text~num для добавление элемента");
            System.out.println("print~num для вывода и удаление элемента");
            System.out.println("Q - для выхода.");

            String input = scanner.nextLine();
            if (input.equals("Q")) {
                break;
            }
            String[] list = input.split("~");
            String text = list[0];
            int num = Integer.parseInt(list[1]);

            if (text.equals("print")) {

                if (num < linkedList.size() && num >= 0) {
                    System.out.println(linkedList.get(num));
                    linkedList.remove(num);
                } else {
                    System.out.println("Некорректаная позиция. Повторите ввод");
                }
                System.out.println(linkedList);
            } else {
                if (num <= linkedList.size() && num >= 0) {
                    linkedList.add(num, text);
                } else {
                    System.out.println("Некорректаная позиция. Повторите ввод");
                }
                System.out.println(linkedList);
            }

        }
        scanner.close();
    }
}
