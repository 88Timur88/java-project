package Seminar2;

public class IsPalindrome{

    public static void main(String[] args) {
    boolean result = isPalindrome("анна");
    System.out.println(result);
    }
    
    
    public static boolean isPalindrome(String s) {
    StringBuilder str = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
    str.append(s.charAt(i));
    }
    return s.equals(str.toString());
    }
    
    }