import java.nio.charset.StandardCharsets;

public class Task_6 {
    public static void main(String[] args) {
        // 6.Напишите метод, который возвращает входящую строку, делая ее ЗаБоРчИкОм
        System.out.println(loverCamel("Hello World!"));
    }

    public static String loverCamel(String str) {

        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            s.append(i % 2 == 0 ? str.substring(i, i + 1).toUpperCase() : str.substring(i, i + 1).toLowerCase());
        }
        return s.toString();
    }
}
