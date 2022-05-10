/**
 * Составить программу, которая требует ввести два числа. Если первое число
 * больше второго, то программа печатает слово больше. Если первое число меньше
 * второго, то программа печатает слово меньше. А если числа равны, программа
 * напечатает сообщение Эти числа равны.
 */

import java.util.*;

public class lab0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите первое число: ");
        int secondNumber = in.nextInt();
        if (firstNumber > secondNumber) System.out.println(firstNumber+" больше "+secondNumber);
        if (firstNumber < secondNumber) System.out.println(firstNumber+" меньше "+secondNumber);
        if (firstNumber > secondNumber) System.out.println("Эти числа равны");
    }
}