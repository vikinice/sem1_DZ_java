/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

import java.util.Scanner;

public class zadacha1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt();
        System.out.println("Треугольное число N=" + a + " равно " + triangle(a) + "\n");

    }

    public static int getInt() {
        while (true) {
            System.out.println("Введите натуральное число N:");
            while (!scanner.hasNextInt()) {
                System.out.println("Вводить нужно натуральное число (целое и положительное)");
                scanner.next();
            }
            int temp = scanner.nextInt();
            if (temp > 0)
                return temp;
        }
    }

    public static int triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return num * (num + 1) / 2;
    }
}
