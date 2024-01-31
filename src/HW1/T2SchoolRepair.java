public class T2SchoolRepair {
    public static void main(String[] args) {
        int paintRequiredTotal = 120;
        int paintReqiredWhitePerRoom = 2;
        int paintReqiredWBrownPerRoom = 4;
        int roomsCount = paintRequiredTotal / (paintReqiredWhitePerRoom + paintReqiredWBrownPerRoom);
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски",
                roomsCount, paintReqiredWhitePerRoom * roomsCount, paintReqiredWBrownPerRoom * roomsCount);
    }
    //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
    //
    //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
}
