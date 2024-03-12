package Seminar1;
// 📌 Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// 📌 Если общего префикса нет, вернуть пустую строку "".

public class Task5 {
    public static void main(String[] args) {
    String[] strs = { "flower", "flow", "floght" }; // fl
    String result = getPrefix(strs);
    System.out.println(result);
    }
    
    private static String getPrefix(String[] strs) {
    String prefix = strs[0];
    
    for (int i = 1; i < strs.length; i++) {
    while (strs[i].indexOf(prefix) != 0) {
    prefix = prefix.substring(0, prefix.length() - 1);
    if (prefix.isEmpty()) {
    return "";
    }
    }
    }
    return prefix;
    }
    }