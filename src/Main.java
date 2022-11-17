import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2(5, 10);
        task_3(0);
        task_4(-4);
        task_5("I love Java", 6);
        task_6(2108);
        task_7();
        task_8();
        task_9();
        task_10();
        task_11(10,5);
        task_12();
    }

    public static void task_1() {
        //Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        // n! (произведение чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i<=n; i++) {
            sum = sum + i;
        }
        for (int j = 1; j<=n; j++) {
            product = product * j;
        }
        System.out.println("The Sum of the numbers from 1 to " +  n + " is " + sum);
        System.out.println("The product of numbers from 1 to " +  n + " is " + product);
    }

    public static boolean task_2(int num1, int num2) {
        //Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        if ((sum >= 10) && (sum <= 20)) {
            System.out.println("True");
            return true;
        }
        else return false;
    }

    public static void task_3(int num){
        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.

        if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }

    public static boolean task_4 (int num) {
        //Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        if (num < 0) {
            return true;
        } else return false;
    }

    public static void task_5(String str, int num){
        //Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз

        for (int i = 1; i <= num; i++) {
            System.out.print("# "+ i + " ");
            System.out.println(str);
        }
    }

    public static boolean task_6(int year) {
        //Написать метод, который определяет, является ли год високосным,
        // и возвращает boolean (високосный - true, не високосный - false).
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
            System.out.println("The year is leap");
            return true;
        } else {
            System.out.println("The year is not leap");
            return false;
        }
    }
    public static void task_7() {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] newArr = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                newArr[i] = 1;
            }
            else newArr[i] = 0;
            }
        for (int j = 1; j< arr.length; j++) {
            System.out.print(newArr[j] + " ");
        }

    }

    public static void task_8(){
        //Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
        int[] arr = new int[101];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    public static void task_9() {
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< arr.length;i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void task_10() {
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]

        int[][] arr = new int[10][10];
        for (int i=0; i< arr.length;i++){
            for (int j=0; j< arr.length; j++) {
                if (i==j) {
                    arr[i][j] =1;
                } else arr[i][j] = 0;
            }
        }
    }

    public static int[] task_11(int len, int initialValue) {
        //Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int[] arr = new int[len];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void task_12 () {
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(arr);
        System.out.println("Min = " + arr[0]);
        System.out.println("Max = " + arr[arr.length-1]);
    }

}
