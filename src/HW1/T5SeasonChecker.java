public class T5SeasonChecker {
    public static void main(String[] args) {
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


    //5) (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
    //
    //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
    //
    //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
}
