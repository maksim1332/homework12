public class Main {
    public static void main(String[] args) {
        ///task 1
        System.out.println("Task 1");
        Author author1 = new Author("Роберт", "Грин.");
        Author author2 = new Author("Роберт", "Грин.");
        Author author3 = new Author("Анна", "Марчук.");

        Book book1 = new Book("48 Законов власти", author1, 2024);
        Book book2 = new Book("Законы человеческой природы", author2, 2021);
        Book book3 = new Book("Хитрый, как лис, ловкий, как тигр", author3, 2021);
        //кстати советую прочесть эти книги )
        book1.setPublicationYear(2024);
        book2.setPublicationYear(2021);
        book3.setPublicationYear(2021);

        System.out.println("Book 1");
        System.out.println(book1.getTitle() + " написана в " + book1.getPublicationYear() + "г." + " Автор " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());

        System.out.println("Book 2");
        System.out.println(book2.getTitle() + " написана в " + book2.getPublicationYear() + "г." + " Автор " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());

        System.out.println("Book 3");
        System.out.println(book3.getTitle() + " написана в " + book3.getPublicationYear() + "г." + " Автор " + book3.getAuthor().getFirstName() + " " + book3.getAuthor().getLastName());
    }
}