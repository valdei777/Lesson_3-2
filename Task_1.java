public class Task_1 {
    public static void main(String[] args) {
        // 1.Напишите метод, который возвращает наиболее из двух целых чисел

        System.out.println(max(100 ,200));


    }

    public static int max(int x, int y) {
        return x < y ? y : x;
    }
}
