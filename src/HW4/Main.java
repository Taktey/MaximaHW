package HW4;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкн");
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book geroiNashegoVremeni = new Book("Герой нашего времени", lermontov, 1840);
        Book kapitanskayaDochka = new Book("Капитанская дочка", pushkin, 1936);
        kapitanskayaDochka.setYear(1836);


        Book stihi = new Book("Стихотворения", new Author("Михаил", "Ломоносов"), 2016);
        int num = 100;
        System.out.println("До метода:\n" + stihi + num);
        doSmth(stihi, num);
        System.out.println("После метода:\n" + stihi + num);
    }

    public static void doSmth(Book book, int number) {
        book.setYear(2000);
        number *= 2;
        System.out.println("Внутри метода:\n" + book + number);
    }
}
