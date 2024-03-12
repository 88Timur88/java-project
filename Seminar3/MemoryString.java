package Seminar3;

import java.util.LinkedList;
import java.util.Scanner;

public class MemoryString {

    public static void main(String[] args) {

        LinkedList<String> data = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Введите текст для сохранения");
            System.out.println("Введите print для списка обратного порятка");
            System.out.println("q -для выхода из программы");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            if (input.equals("print")) {

                for (int i = data.size() - 1; i >= 0; i--) {
                    System.out.print(data.get(i) + " ");
                    
                }
            } else if (input.equals("revert")) {
                data.removeLast();
                System.out.println(data);
            } else {
                data.add(input);
                System.out.println(data);
            }

        }
        scanner.close();
    }
}