import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        Random rndnums = new Random();
        int len = 100;
        ArrayList<Integer> listNums = new ArrayList<Integer>(len);
        ArrayList<Integer> listEvenNums = new ArrayList<Integer>(len);
        for (int i = 0; i<len; i++) {
            listNums.add(rndnums.nextInt(100));
        }
        System.out.println("the original list of numbers: ");
        System.out.println(listNums);
        for (int i = 0; i<len; i++) {
            if ((listNums.get(i) % 2) == 0) {
                listEvenNums.add(listNums.get(i));
            }
        }
        listNums.removeAll(listEvenNums);
        System.out.println("The result: ");
        System.out.println(listNums);
    }

    public static void task2 () {
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        // * sum / count
        Random rndNums = new Random();
        int len = 25;
        int maxNum, minNum;
        double averageNum = 0;

        ArrayList<Integer> listNums = new ArrayList<Integer>();
        for (int i=0;i<len;i++) {
            listNums.add(rndNums.nextInt(100));
            averageNum = averageNum+listNums.get(i);
        }
        System.out.println("Original list: ");
        System.out.println(listNums);
        Collections.sort(listNums);
        System.out.println("sorted list: ");
        minNum = listNums.get(0);
        maxNum = listNums.get(len - 1);
        System.out.println("The sum of numbers: " + averageNum);
        averageNum = averageNum/len;
        System.out.println("The min element: " + minNum);
        System.out.println("The max element: " + maxNum);
        System.out.println("The average: " + averageNum);
    }
}
