package Seminar5;

import java.util.HashMap;
import java.util.Stack;

public class Brackets {
public static void main(String[] args) {
String [] strs = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
for (String str : strs) {
boolean result = checkBrackets(str);
System.out.println(str + " ------> " + (result?"истина":"ложь"));

}
}
public static HashMap<Character, Character> getBrackets(){
HashMap<Character, Character> brackets = new HashMap<>();
brackets.put(')', '(');
brackets.put(']', '[');
brackets.put('}', '{');
brackets.put('>', '<');
return brackets;
}
public static boolean checkBrackets(String str) {
HashMap<Character, Character> brackets = getBrackets();
Stack<Character> stack = new Stack<>();
for (char c : str.toCharArray()) {
if (brackets.containsValue(c)) {
stack.push(c); 
}
else if (brackets.containsKey(c)) {
if (stack.isEmpty() || stack.pop()!= brackets.get(c)) {
return false;
}

}

}
return stack.isEmpty();

}


}