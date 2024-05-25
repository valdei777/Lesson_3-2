public class Task_3 {
    public static void main(String[] args) {
        // 3.Напишите метод, который возвращает самую длинную из трех строк

        System.out.println(maximumOfThreeLines("s1", "s22", "s"));

    }

    public static String maximumOfThreeLines(String s1, String s2, String s3) {
        int max = Task_1.max(s1.length(), Task_1.max(s2.length(), s3.length()));
        return s1.length() == max ? s1 : s2.length() == max ? s2 : s3;
    }
}
