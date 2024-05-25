public class Task_2 {
    public static void main(String[] args) {
        // 2.Напишите метод, который возвращает наиболее из двух дробных чисел Вынослив похоже,
        // не так ли? Хотелось бы как-то оптимизировать?:) не спешите, это все возможно: мы до этого ещё дойдём!

        System.out.println(max( 1.3563458f, 1.3563467f));

    }

    public static float max (float x, float y) {
        return x > y ? x : y;
    }

}
