public class Task_8 {
    public static void main(String[] args) {
        // 8.Напишите метод, который принимает три массива, а возвращает массив, сумма элементов которого самая большая
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] y = {1, 2, 3, 4, 5, 6, 7};
        int[] z = {1, 2, 3, 4, 5, 6};

        int[] max = maxMas(x, y, z);


        System.out.println("Сумма элементов массива составила: " + sumMas(max));
        System.out.print("Элементы самого большого массива: ");
        for(int i : max) {
            System.out.print(i + " ");
        }

    }

    public static int[] maxMas(int[] x, int[] y, int[] z) {

        return sumMas(x) < sumMas(y) ? sumMas(y) < sumMas(z) ? z : y : sumMas(x) < sumMas(z) ? z : x;
    }

    public static int sumMas(int[] mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum = sum + mas[i];

        }

        return sum;
    }

}
