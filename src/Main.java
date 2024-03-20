public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 1; i < 11; i ++ ) {
            System.out.println(i);
        }

        // Задача 2
        for (int i = 10; i > 0; i --) {
            System.out.println(i);
        }

        // Задача 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        for (int i = 10; i > -11; i --) {
            System.out.println(i);
        }

        // Задача 5
        for (int i = 1904; i <= 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //  Задача 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i ++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 9
        total = 0;
        for (int i = 1; i < 13; i ++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 10
        for (int i = 1; i <= 10; i ++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}