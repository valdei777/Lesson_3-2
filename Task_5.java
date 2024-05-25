public class Task_5 {
    public static void main(String[] args) {
        // 5.Напишите метод, который возвращает самую длинную из
        // пяти. Хочется как-то оптимизировать?:) это хорошо, сможем, когда изучим vararg
        System.out.println(maximumFoFiveLines("fff", "fff", "fff", "fff", "fffffffff"));
    }

    public static String maximumFoFiveLines(String s1, String s2, String s3, String s4, String s5) {
        return Task_3.maximumOfThreeLines(Task_3.maximumOfThreeLines(s1, s2, s3), s4, s5);
    }
}
