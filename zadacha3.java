import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Реализовать простой калькулятор
 */
public class zadacha3 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***Простой калькулятор***");
        String str = "";

        while (!str.toLowerCase().equals("нет")) {
            System.out.println("Введите число: ");
            int rez = Integer.parseInt(reader.readLine());
            System.out.println("Введите операцию: ");
            String c = reader.readLine();
            System.out.println("Введите следующее число: ");
            int y = Integer.parseInt(reader.readLine());
            if (c.equals("+")) {
                rez = rez + y;
            }
            else if (c.equals("-")) {
                rez = rez - y;
            }
            else if (c.equals("/")) {
                rez = rez / y;
            }
            else if (c.equals("*")) {
                rez = rez * y;
            }

            System.out.println(rez);
            rez = 0;
            System.out.println("Хотите выполнить еще одну операцию? (Да/Нет)");
            str = reader.readLine();
        }
    }
}