//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 15; i++)
            list.add(rnd.nextInt(100));
        System.out.println(list);

        list.removeIf(number -> number % 2 == 0);
        System.out.println(list);

    }
}
