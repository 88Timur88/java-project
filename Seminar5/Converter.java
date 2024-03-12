package Seminar5;

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXIV = 2024

// 'I', 1
// 'V', 5
// 'X', 10
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000

import java.util.HashMap;

public class Converter {
public static void main(String[] args) {
String roman = "MMXXIV";
System.out.println(convertRomanToArabic(roman));

}

public static HashMap<Character, Integer> getRomanArabicMap() {
HashMap<Character, Integer> map = new HashMap<>();
map.put('I', 1);
map.put('V', 5);
map.put('X', 10);
map.put('L', 50);
map.put('C', 100);
map.put('D', 500);
map.put('M', 1000);
return map;
}

public static int convertRomanToArabic(String roman) {
HashMap<Character, Integer> map = getRomanArabicMap(); // MMXXIV = 2024
int result = 0;
int prevNum = 0;
for (int i = roman.length() - 1; i >= 0; i--) {
int num = map.get(roman.charAt(i));
if (num < prevNum) {
result -= num;
} else {
result += num;
}
prevNum = num;
}
return result;

}

}
