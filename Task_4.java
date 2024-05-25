public class Task_4 {
    public static void main(String[] args) {
        // 4.Напишите метод, который возвращает самую длинную из
        // четырёх строк
        System.out.println(maximumOfFourLines("ssss12", "sss54", "sss43", "sss4"));

    }

    public static String maximumOfFourLines(String s1, String s2, String s3, String s4) {

        String sMaxT = Task_3.maximumOfThreeLines(s1, s2, s3);

        return sMaxT.length() < s4.length() ? s4 : sMaxT;
    }
}
