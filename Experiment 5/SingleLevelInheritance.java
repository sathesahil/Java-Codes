import java.util.Scanner;

class SingleLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleBookInfo[] books = new SingleBookInfo[3];

        for (int i = 0; i < books.length; i++) {
            books[i] = new SingleBookInfo();
            System.out.println("Enter details for Book " + (i + 1) + ":");
            books[i].accept(scanner);
        }

        System.out.println("\nBook Information:");
        for (SingleBookInfo book : books) {
            book.show();
            System.out.println();
        }

        scanner.close();
    }
}

class SingleBook {
    String author;
    String title;
    String publisher;

    void accept(Scanner scanner) {
        System.out.print("Author: ");
        author = scanner.nextLine();
        System.out.print("Title: ");
        title = scanner.nextLine();
        System.out.print("Publisher: ");
        publisher = scanner.nextLine();
    }
}

class SingleBookInfo extends SingleBook {
    double price;
    int stockPosition;

    void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("Price: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("Stock Position: ");
        stockPosition = Integer.parseInt(scanner.nextLine());
    }

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
    }
}