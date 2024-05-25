import java.util.Arrays;

public class Task_9 {
    public static void main(String[] args) {
        // 9.Напишите метод, который принимает массив чисел, а возвращает исходный массив, но без отрицательных чисел

        int[] masIntegers = {1, 2, -3, -4};

        int [] mas = positiveNumbers(masIntegers);

        Arrays.stream(mas).forEach(System.out::println);


    }

    public static int[] positiveNumbers(int[] x) {
        int[] mas = new int[x.length];

        for(int i = 0; i < mas.length; i++) {
            mas[i] = Math.abs(x[i]);
        }

        return mas;
    }
}
