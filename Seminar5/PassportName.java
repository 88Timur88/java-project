package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class PassportName {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");

        String targetName = "Петрова";

        System.out.println("Данные по сотрудникам с фамилией " + targetName);

        for (Integer pssportNum : hashMap.keySet()) {
            String name = hashMap.get(pssportNum);
            if (name.equals(targetName)) {
                System.out.println("Номер паспорта: " + pssportNum + ", Фамилия: " + name);
            }
        }
    }
}
