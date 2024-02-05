package HW1;

public class Main {
    public static void main(String[] args) {
        doFirstHomework();

    }
    public static void doFirstHomework() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int intVariable = 1000;
        byte byteVariable = 10;
        short shortVariable = 100;
        long longVariable = 12345L;
        float floatVariable = 10.3f;
        double doubleVariable = 10.4d;
        char charVariable = 'V';
        boolean isBoolean = true;
        System.out.printf("Значение переменной intVariable с типом int равно %d\n", intVariable);
        System.out.printf("Значение переменной byteVariable с типом byte равно %d\n", byteVariable);
        System.out.printf("Значение переменной shortVariable с типом short равно %d\n", shortVariable);
        System.out.printf("Значение переменной longVariable с типом long равно %d\n", longVariable);
        System.out.printf("Значение переменной floatVariable с типом float равно %f\n", floatVariable);
        System.out.printf("Значение переменной doubleVariable с типом double равно %f\n", doubleVariable);
        System.out.printf("Значение переменной charVariable с типом char равно %s\n", charVariable);
        System.out.printf("Значение переменной isBoolean с типом boolean равно %b\n", isBoolean);
    }

    public static void task2() {
        int paintRequiredTotal = 120;
        int paintReqiredWhitePerRoom = 2;
        int paintReqiredWBrownPerRoom = 4;
        int roomsCount = paintRequiredTotal / (paintReqiredWhitePerRoom + paintReqiredWBrownPerRoom);
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски",
                roomsCount, paintReqiredWhitePerRoom * roomsCount, paintReqiredWBrownPerRoom * roomsCount);
    }

    public static void task3() {
        class Person {
            String name;
            float salary;

            public Person(String name, float salary) {
                this.name = name;
                this.salary = salary;
            }

        }
        Person masha = new Person("Маша", 67760.00f);
        Person denis = new Person("Денис", 83690.00f);
        Person kristina = new Person("Кристина", 76230.00f);
        float salaryMultiplicator = 1.1f;
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                masha.name, masha.salary * salaryMultiplicator, (masha.salary * salaryMultiplicator - masha.salary) * 12);
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                denis.name, denis.salary * salaryMultiplicator, (denis.salary * salaryMultiplicator - denis.salary) * 12);
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                kristina.name, kristina.salary * salaryMultiplicator, (kristina.salary * salaryMultiplicator - kristina.salary) * 12);
    }

    public static void task4() {
        for (int temperature = 0; temperature <= 6; temperature += 6) {
            if (temperature < 5) {
                System.out.printf("На улице %d градусов\n", temperature);
                System.out.println("На улице холодно, нужно надеть шапку");
            } else if (temperature > 5) {
                System.out.printf("На улице %d градусов\n", temperature);
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
        }
    }

    public static void task5() {
        int monthNumber = 12;
        if (monthNumber <= 12 && monthNumber >= 0) {
            switch (monthNumber) {
                case (1):
                case (2):
                case (12):
                    System.out.println("Зима");
                    break;
                case (3):
                case (4):
                case (5):
                    System.out.println("Весна");
                    break;
                case (6):
                case (7):
                case (8):
                    System.out.println("Лето");
                    break;
                case (9):
                case (10):
                case (11):
                    System.out.println("Осень");
                    break;
            }
        }
    }

    public static void task6() {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task7() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task8() {
        int targetBalance = 2459000;
        int moneyPerMonth = 15000;
        int monthRequires = 0;
        int balance = 0;
        while (balance < targetBalance) {
            balance += moneyPerMonth;
            monthRequires++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей", monthRequires, balance);
    }
}
