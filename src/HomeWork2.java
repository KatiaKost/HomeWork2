import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Привет, как тебя зовут?");
        String name = input.nextLine();
        System.out.println("Рад знакомству, " + name);

        System.out.println(name + ", сколько тебе лет?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println(age + "??? Какой ты большой!");

        System.out.println(name + ", какое у тебя хобби?");
        String hobby = input.nextLine();
        System.out.println("Мне тоже нравится, " + hobby);

        System.out.println(name + ", какая у тебя любимая еда?");
        String food = input.nextLine();
        System.out.println(food + ". Это очень вкусная еда!!!");

        System.out.println(name + ", а какое твоё любимое домашнее животное?");
        String pets = input.nextLine();
        System.out.println(pets + ", а я люблю другое животное.");

        System.out.println("Как тебе эта вечеринка?");
        String partyRating = input.nextLine();
        System.out.println(partyRating + ", я тоже так думаю.");

        System.out.println("Какой у тебя любимый цвет?");
        String color = input.nextLine();
        System.out.println(color + ". Не люблю этот цвет.");

        System.out.println(name + ", как зовут твою маму?");
        String mothersName = input.nextLine();
        System.out.println(mothersName + "? Красивое имя, А как зовут твоего папу?");
        String fathersName = input.nextLine();
        System.out.println(fathersName + ", не часто встречаю такое имя. А сколько у тебя сестёр?");
        int numberOfSisters = input.nextInt();
        System.out.println(numberOfSisters + "ого, у меня тоже есть несколько сестер.)))");

        System.out.println("Какая социальная сеть тебе нравится?");
        String snw = input.nextLine();
        System.out.println(snw + "? Люблю эту социальную сеть.");

        System.out.println("Какое твоё любимое время года?");
        String season = input.nextLine();
        System.out.println(season + "? А люблю все времена года.");

        System.out.println("Ты жаворонок или сова?");
        String personalityType = input.nextLine();
        System.out.println("Я тоже " + personalityType);

        System.out.println("Что ты обычно ешь на завтрак?");
        String breakfast = input.nextLine();
        System.out.println(breakfast + "- Думаю это вкусно.");

        System.out.println("Какая твоя любимая зарубежная страна?");
        String country = input.nextLine();
        System.out.println(country + "? О, хочу туда поехать!!!");

        System.out.println("Какой жанр фильмов тебе нравится?");
        String filmGenre = input.nextLine();
        System.out.println(filmGenre + " значит? А какой твой любимый фильм в этом жанре?");
        String film = input.nextLine();
        System.out.println(film + " - люблю этот фильм.");

        System.out.println("Твой нелюбимый предмет в школе?");
        String subject = input.nextLine();
        System.out.println("Тоже не люблю " + subject);

        System.out.println("Сколько было тебе лет, когда пришла первая любовь?");
        int firstLove = input.nextInt();
        System.out.println(firstLove + "? ООООО, это так крууутооо.");

        System.out.println("Что тебе хотелось бы украсть в супермаркете?");
        String theft = input.nextLine();
        System.out.println(theft + ". Интересно!!!");

        System.out.println("А какое у тебя любимое число?");
        int number = input.nextInt();
        System.out.println(number + "? А вот у меня 13");

        System.out.println("А какой номер был у твоей школы, когда ты училась?");
        int numberOfSchool = input.nextInt();
        System.out.println("Ого, " + numberOfSchool + "- это же не далеко от моей!");

        System.out.println("Спасибо за разговор, увидмся!");
    }
}