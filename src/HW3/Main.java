package HW3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1\n" + doTask1(10));
        System.out.println("Задача 2\n" + doTask2(9));
        System.out.println("Задача 3\n" + doTask3(10));
        System.out.println("Задача 4");
        doTask4();
        System.out.println("Задача 5");
        doTask5();
        System.out.println("Задача 6");
        doTask6();
        System.out.println("Задача 7");
        doTask7();
        System.out.println("Задача 8");
        doTask8();

    }

    public static int doTask1(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + doTask1(n - 1);
        }
    }

    public static int doTask2(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * doTask2(n - 1);
        }
    }

    public static int doTask3(int n) {
        if (n == 1 || n == 2) return 1;
        return doTask3(n - 1) + doTask3(n - 2);
    }

    public static void doTask4() {
        int intVar = 5;
        double doubleVar = 7.0;
        boolean boolVar = true;
        Integer intBox = intVar;
        Double doubleBox = doubleVar;
        Boolean boolBox = boolVar;
        System.out.println("int переменная = " + intVar);
        System.out.println("double переменная = " + doubleVar);
        System.out.println("boolean переменная = " + boolVar);
        System.out.println("int упакованный = " + intBox);
        System.out.println("double упакованный = " + doubleBox);
        System.out.println("boolean упакованный = " + boolBox);
    }

    public static void doTask5() {
        int intVar = 5;
        Integer intBox = 8;
        System.out.println("Integer+int = " + (intBox + intVar));
        double doubleVar = 6.0;
        Double doubleBox = 9.0;
        System.out.println("Double-double = " + (doubleBox - doubleVar));
        boolean boolVar = true;
        Boolean boolBox = false;
        System.out.println("Boolean && boolean = " + (boolBox && boolVar));
    }

    public static void doTask6() {
        Integer a = 5;
        Integer b = 5;
        System.out.println("Integer value = " + a + ", Integer == Integer - " + (a == b));
        System.out.println("Integer value = " + a + ", Integer.equals(Integer) - " + (a.equals(b)));
        for (int i = -200; i <= 200; i += 100) {
            a = i;
            b = i;
            System.out.println("Integer value = " + a + ", Integer == Integer - " + (a == b));
            System.out.println("Integer value = " + a + ", Integer.equals(Integer) - " + (a.equals(b)));
        } //Значения от -128 до 127 автоматически кэшируются
    }

    public static void doTask7() {
        System.out.printf("Время выполнения операции с примитивами: %d миллисекунд\n", checkTimeWithPrimitive());
        System.out.printf("Время выполнения операции с обертками: %d миллисекунд\n", checkTimeWithWrapper());

    }

    public static long checkTimeWithPrimitive() {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long checkTimeWithWrapper() {
        long startTime = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void doTask8() {
        Integer intBox = 0;
        Long longBox = 0L;
        intBox= Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println("При превышении максимального значения, значение становится минимальным (числовая ось замкнута в самой себе) "
                +intBox);
        intBox= Integer.MIN_VALUE + Integer.MIN_VALUE;
        System.out.println("При уменьшении ниже минимального значения, значение становится максимальным (числовая ось замкнута в самой себе) "
                +intBox);

        longBox= Long.MAX_VALUE + Long.MAX_VALUE;
        System.out.println("При превышении максимального значения, значение становится минимальным (числовая ось замкнута в самой себе) "
                +longBox);
        longBox= Long.MIN_VALUE + Long.MIN_VALUE;
        System.out.println("При уменьшении ниже минимального значения, значение становится максимальным (числовая ось замкнута в самой себе) "
                +longBox);
    }

}
//1) Рекурсивный подсчет суммы чисел - напишите рекурсивный метод, который принимает целое число n и возвращает сумму всех чисел от 1 до n
//
//2) Напишите рукурсивный расчет факториала числа
//
//3) Напишите рукурсивный расчет числа Фибоначчи по его порядковому номеру
//
//4)  - Создать переменные различных примитивных типов данных (int, double, boolean);
//   - Упаковать эти данные в объекты соответствующих классов-оберток (Integer, Double, Boolean);
//   - Вывести на экран значения примитивных типов и упакованных объектов.
//
//5) Выполните несколько арифметических операций с использованием переменных классов-оберток и примитивных типов, чтобы увидеть автораспаковку в действии. Например, сложите Integer и int, аналогично с другими типами
//
//6) Сравнение переменных:
//
//Создайте две переменные типа Integer с одинаковыми значениями, инициализированные через автоупаковку
//Сравните эти переменные с использованием == и Objects.equals(). Выведите результаты сравнения в консоль
//Проделайте это со значениями в диапазоне от -128 и 127 и вне этого диапазона - обратите внимание на разницу, попробуйте найти объяснение этой разницы
//7) Измерье время выполнения операций с примитивом и оберткой (в двух разных методах, например checkTimeWithPrimitive и checkTimeWithWrapper):
//
//Задайте время начала операции
//long startTime = System.currentTimeMillis();
//Задайте переменную sum (в одном методе int sum, в другом Integer sum)
//В цикле сложите большое количество значений (можете просто прибавлять к sum переменную i на каждой итерации), например
//
//Integer sum = 0;
//for (int i = 0; i < count; i++) {
//sum += i;
//}
//
//также обратите внимание, что большие числа для наглядности можно задавать как 100_000_000
//Замерьте время выполнения
//long endTime = System.currentTimeMillis();
//long duration = endTime - startTime;
//System.out.println("Время выполнения операции: " + duration + " миллисекунд");
//Сравните результаты
//8) Протестируйте переполнение переменных типа Integer и Long путем увеличения максимального значения (константа MAX_VALUE) и уменьшения минимального (константа MIN_VALUE)

