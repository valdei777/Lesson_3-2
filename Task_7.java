import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        // 7.Напишите метод, который возвращает наибольший элемент массива

        int[] mas = new int[] {1, 2, 3, 4, 6, 10};

        System.out.println(maxToMas(mas));

    }

    public static int maxToMas(int[] x) {

        Arrays.sort(x);
        return x[x.length - 1];
    }
}
