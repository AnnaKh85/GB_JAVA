public class Main {
    public static void main(String[] args)
    {
        System.out.println(IfPoly("мадам"));
    }

    public static boolean IfPoly(String str) {
        //Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение)
        StringBuilder reverse = new StringBuilder();
        String clear = str.replaceAll("\\s", "").toLowerCase();
        char[] strToChar = clear.toCharArray();
        for (int i = strToChar.length - 1; i >=0; i--){
            reverse.append(strToChar[i]);
        }
        return (reverse.toString().equals(clear));
    }
}