import java.util.LinkedList;
import java.util.Scanner;

public class Task4_text_num {

    //2 Реализовать консольное приложение, которое: Принимает от пользователя строку вида text~num
    public static void main(String[] params) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("[text~num]-->");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int idx = input.lastIndexOf("~");
            if (input.isEmpty() || idx == -1) {
                throw new RuntimeException("Ошибка: ввод не содержит символа ~");
            }

            String text = input.substring(0, idx);
            String numText = input.substring(idx+1);
            int num;

            if (numText.isEmpty()) {
                System.out.println("Не введён номер позиции");
                continue;
            }

            try {
                num = Integer.parseInt(numText);
            } catch (NumberFormatException e) {
                System.out.println("Не определён номер позиции");
                continue;
            }

            if (num < 0) {
                System.out.println("Номер позиции < 0");
                continue;
            }

            if (text.equals("print")) {
                if (num < list.size()) {
                    String textForPrint = list.get(num);
                    System.out.println("=>" + (textForPrint == null ? "\"\"" : textForPrint));
                    list.set(num, null);
                } else {
                    System.out.println("=>" + "\"\"");
                }
            } else {
                for (int i = 0; i <= num; i++) {
                    if (i >= list.size()) {
                        list.addLast(null);
                    }
                }

                list.set(num, text);
            }
        }

        scanner.close();
    }


    /**
     * 2 Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     * Если ввод не содержит символа ~, то завершает программу с ошибкой.
     * Если введено -1, то выходим
     * string~3
     * java~5
     * print~0 => ""
     * print~3 => string
     */
}
