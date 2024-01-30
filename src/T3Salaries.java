public class T3Salaries {

    public static void main(String[] args) {
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
}


//К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//
//Маша получает 67 760 рублей в месяц.
//Денис получает 83 690 рублей в месяц.
//Кристина получает 76 230 рублей в месяц.
//Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
//
//Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

