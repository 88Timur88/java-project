package Seminar1;

// Задание №1: Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает 
// число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.
// public class Answer { // Домашнее задание №1
//     public static void main(String[] args) {
//         int n = 4;
//         if (n < 1) {
//             System.out.println("-1");
//         } else {
//             int sum = 0;
//             int i = 0;
//             while (i <= n) {
//                 sum = sum + i;
//                 i++;
//             }
//             System.out.println(sum);
//         }
//         // System.out.println(n);;
//     }
// }

// Задание №2: Напишите функцию printPrimeNums, которая выведет на экран 
// все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// class Answer {
//     public static void main(String[] args) {
//         printPrimeNums(1000);
//     }

//     public static void printPrimeNums(int y) {
//         int k = 0;
//         for (int i = 2; i <= y; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0)
//                     k++;
//             }
//             if (k == 2) {
//                 System.out.println(i);
//             }
//             k = 0;
//         }
//     }
// }

// Задание №3: В методе calculate класса Calculator реализовать калькулятор,
// который будет выполнять математические операции (+, -, *, /) 
// над двумя целыми числами и возвращать результат вещественного типа.

// В классе Printer необходимо реализовать проверку переданного оператора,
// при некорректном операторе программа должна вывести сообщение об ошибке 
// "Некорректный оператор: 'оператор'".

class Calculator {
    public static void main(String[] args) {
        calculate(3,'+', 7);
    }


    public static double calculate(int a,char op, int b) {
        double rez;
        if (op == '+') {
            rez = a + b;
            System.out.println(rez);            
            return rez;

        }
        if (op == '-') {
            rez = a - b;
            System.out.println(rez);
            return rez;
        }
        if (op == '*') {
            rez = a * b;
            System.out.println(rez);
            return rez;
        }
        if (op == '/') {
            rez = a / b;
            System.out.println(op);
            return rez;
        }
    else{
            System.out.println("Некорректный оператор: " + op);
        }
    return op;
        
    }
}