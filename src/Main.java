public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);
        Book deadSouls = new Book("Мертвые души", gogol, 1842);

        System.out.println(warAndPeace.getTitle() + " " + warAndPeace.getPublishingYear());
        System.out.println(deadSouls.getTitle() + " " + deadSouls.getPublishingYear());

        warAndPeace.setPublishingYear(1995);
        System.out.println(warAndPeace.getTitle() + " " + warAndPeace.getPublishingYear());

    }
}