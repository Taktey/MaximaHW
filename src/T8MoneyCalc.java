public class T8MoneyCalc {
    public static void main(String[] args) {
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
    //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
    //
    //Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
}
