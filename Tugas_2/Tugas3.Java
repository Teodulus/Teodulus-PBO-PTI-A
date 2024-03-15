import java.io.*;
import java.util.*;

class Book {
    private String title;
    private List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
    public String toString() {
        return title + " by " + String.join(", ", authors);
    }
}

class Library {
    private Map<String, List<Book>> categories;

    public Library() {
        categories = new HashMap<>();
    }

    public void addBook(String category, Book book) {
        categories.computeIfAbsent(category, k -> new ArrayList<>()).add(book);
    }

    public void removeBook(String category, Book book) {
        List<Book> books = categories.get(category);
        if (books != null) {
            books.remove(book);
        }
    }

    public List<Book> getBooksInCategory(String category) {
        return categories.getOrDefault(category, Collections.emptyList());
    }

  
    public Set<String> getCategories() {
        return categories.keySet();
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        addBooksToLibrary(library);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Tampilkan Buku dalam Kategori");
            System.out.println("4. Tampilkan Jenis-jenis Buku dalam Kategori");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(library, scanner);
                    break;
                case 2:
                    removeBook(library, scanner);
                    break;
                case 3:
                    displayBooksInCategory(library, scanner);
                    break;
                case 4:
                    displayCategories(library);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }

    private static void addBooksToLibrary(Library library) {
        library.addBook("teknologi", new Book("Clean Code", Arrays.asList("Robert C. Martin")));
        library.addBook("teknologi", new Book("Design Patterns", Arrays.asList("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides")));
        library.addBook("teknologi", new Book("Refactoring", Arrays.asList("Martin Fowler")));
        library.addBook("teknologi", new Book("Introduction to Algorithms", Arrays.asList("Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein")));
        library.addBook("teknologi", new Book("The Pragmatic Programmer", Arrays.asList("Andrew Hunt", "David Thomas")));

        library.addBook("filsafat", new Book("Meditations", Arrays.asList("Marcus Aurelius")));
        library.addBook("filsafat", new Book("Critique of Pure Reason", Arrays.asList("Immanuel Kant")));
        library.addBook("filsafat", new Book("Beyond Good and Evil", Arrays.asList("Friedrich Nietzsche")));
        library.addBook("filsafat", new Book("Simulacra and Simulation", Arrays.asList("Jean Baudrillard")));
        library.addBook("filsafat", new Book("Thus Spoke Zarathustra", Arrays.asList("Friedrich Nietzsche")));

        library.addBook("sejarah", new Book("Sapiens: A Brief History of Humankind", Arrays.asList("Yuval Noah Harari")));
        library.addBook("sejarah", new Book("The Silk Roads: A New History of the World", Arrays.asList("Peter Frankopan")));
        library.addBook("sejarah", new Book("Guns, Germs, and Steel: The Fates of Human Societies", Arrays.asList("Jared Diamond")));
        library.addBook("sejarah", new Book("The Rise and Fall of the Third Reich", Arrays.asList("William L. Shirer")));
        library.addBook("sejarah", new Book("A People's History of the United States", Arrays.asList("Howard Zinn")));

        library.addBook("agama", new Book("Keberagaman", Arrays.asList("Nadia Sumirta")));
        library.addBook("agama", new Book("Filsafat Sudut Pandang Katolik", Arrays.asList("James Arthur OSC")));
        library.addBook("agama", new Book("Asal mula sang hyang twang", Arrays.asList("Vyasa decarita")));
        library.addBook("agama", new Book("Kedatangan Modernisasi", Arrays.asList("Ivan Richerson")));
        library.addBook("agama", new Book("Aliran MRW", Arrays.asList("Song Ga In")));

        library.addBook("psikologi", new Book("Thinking, Fast and Slow", Arrays.asList("Daniel Kahneman")));
        library.addBook("psikologi", new Book("Man's Search for Meaning", Arrays.asList("Viktor E. Frankl")));
        library.addBook("psikologi", new Book("Influence: The Psychology of Persuasion", Arrays.asList("Robert Cialdini")));
        library.addBook("psikologi", new Book("The Power of Habit", Arrays.asList("Charles Duhigg")));
        library.addBook("psikologi", new Book("Quiet: The Power of Introverts in a World That Can't Stop Talking", Arrays.asList("Susan Cain")));

        library.addBook("politik", new Book("The Prince", Arrays.asList("Niccolò Machiavelli")));
        library.addBook("politik", new Book("The Communist Manifesto", Arrays.asList("Karl Marx", "Friedrich Engels")));
        library.addBook("politik", new Book("Democracy in America", Arrays.asList("Alexis de Tocqueville")));
        library.addBook("politik", new Book("Das Kapital", Arrays.asList("Karl Marx")));
        library.addBook("politik", new Book("The Federalist Papers", Arrays.asList("Alexander Hamilton", "James Madison", "John Jay")));

        library.addBook("fiksi", new Book("1984", Arrays.asList("George Orwell")));
        library.addBook("fiksi", new Book("To Kill a Mockingbird", Arrays.asList("Harper Lee")));
        library.addBook("fiksi", new Book("The Great Gatsby", Arrays.asList("F. Scott Fitzgerald")));
        library.addBook("fiksi", new Book("Pride and Prejudice", Arrays.asList("Jane Austen")));
        library.addBook("fiksi", new Book("Brave New World", Arrays.asList("Aldous Huxley")));
    }

    private static void addBook(Library library, Scanner scanner) {
        System.out.print("Kategori: ");
        String category = scanner.nextLine();
        System.out.print("Judul: ");
        String title = scanner.nextLine();
        System.out.print("Penulis (pisahkan dengan koma jika lebih dari satu): ");
        String[] authorsArray = scanner.nextLine().split(",");
        List<String> authors = Arrays.asList(authorsArray);
        Book newBook = new Book(title, authors);
        library.addBook(category, newBook);
        System.out.println("Buku berhasil ditambahkan ke dalam kategori " + category);
    }

    private static void removeBook(Library library, Scanner scanner) {
        System.out.print("Kategori: ");
        String category = scanner.nextLine();
        System.out.print("Judul: ");
        String title = scanner.nextLine();
        System.out.print("Penulis: ");
        String author = scanner.nextLine();
        Book bookToRemove = new Book(title, Collections.singletonList(author));
        library.removeBook(category, bookToRemove);
        System.out.println("Buku berhasil dihapus dari kategori " + category);
    }

    private static void displayBooksInCategory(Library library, Scanner scanner) {
        System.out.println("Pilih tipe buku:");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        System.out.print("Pilih: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        String category;
        switch (choice) {
            case 1:
                category = "teknologi";
                break;
            case 2:
                category = "filsafat";
                break;
            case 3:
                category = "sejarah";
                break;
            case 4:
                category = "agama";
                break;
            case 5:
                category = "psikologi";
                break;
            case 6:
                category = "politik";
                break;
            case 7:
                category = "fiksi";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        List<Book> books = library.getBooksInCategory(category);
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku dalam kategori " + category);
        } else {
            System.out.println("Buku dalam kategori " + category + ":");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static void displayCategories(Library library) {
        System.out.println("\nJenis-jenis Buku dalam Kategori:");
        Set<String> categories = library.getCategories(); 
        for (String category : categories) {
            System.out.println("- " + category);
        }
    }
}
