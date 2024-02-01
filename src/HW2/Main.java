package HW2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        System.out.println(task3());
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int task2() {
        System.out.println("Задача 2");
        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i - 1] = i;
            if (i % 2 != 0) System.out.print(i + ", ");
        }
        System.out.println();
        return 0;
    }

    public static double task3() {
        System.out.println("Задача 3");
        double[] array = new double[10];
        double res = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = Math.random() * 20;
            res += array[i];
        }
        return res;
    }

    public static void task4() {
        System.out.println("Задача 4");
        String[] array = {"e", "d", "c", "b", "a"};
        System.out.println(concat(array));
    }

    public static String concat(String[] someArray) {
        String res = "";
        for (int i = 0; i < 5; i++) {
            res += someArray[i];
        }
        return res;
    }
}


//ЗАДАНИЕ:

//далее таски (task1...n) делать в новых методах с названиями "task1...n" и также вызывать их из метода main
//
//task1) объявить пустой массив типа int[] с заданным размером, в цикле заполнить его случайными значениями (с помощью Random), далее вывести весь массив в консоль с помощью Arrays.toString()
//
//task2) объявить массив со значениями от 1 до 10, вывести нечетные значения (остаток от деления на 2 НЕ равен нулю) в консоль
//
//task3) объявить массив double[] с дробными значениями, в цикле просуммировать все значения, и ВЕРНУТЬ из метода результат
//(в методе main при этом вывести в консоль результат этого метода)
//
//task4) объявить массив String[] и ПЕРЕДАТЬ массив как параметр в другой (еще один) метод - static String concat(String[] stringArray).
//Этот метод должен возвращать значение String - конкатенированные (объединенные) строки из исходного массива.
//Полученный результат вывести в консоль в исходном методе task4
//(вспоминаем как вызывать методы из других методов и как использовать их результат - возвращаемое ими значение)
//
//P.S. Идея будет вам предлагать кое-какую альтернативу конкатенации строк в цикле - можете согласитьсяс ней и дополнительно посмотреть что же такое StringBuilder
