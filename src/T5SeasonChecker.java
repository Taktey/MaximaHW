public class SeasonChecker {
    public static void main(String[] args) {
        int monthNumber = 12;
        if (monthNumber <= 12 && monthNumber >= 0) {
            switch (monthNumber) {
                case (1):
                    System.out.println("Зима");
                    break;
                case (2):
                    System.out.println("Зима");
                    break;
                case (3):
                    System.out.println("Весна");
                    break;
                case (4):
                    System.out.println("Весна");
                    break;
                case (5):
                    System.out.println("Весна");
                    break;
                case (6):
                    System.out.println("Лето");
                    break;
                case (7):
                    System.out.println("Лето");
                    break;
                case (8):
                    System.out.println("Лето");
                    break;
                case (9):
                    System.out.println("Осень");
                    break;
                case (10):
                    System.out.println("Осень");
                    break;
                case (11):
                    System.out.println("Осень");
                    break;
                case (12):
                    System.out.println("Зима");
                    break;
            }
        }
    }


    //5) (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
    //
    //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
    //
    //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
}
