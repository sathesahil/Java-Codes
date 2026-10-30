import java.util.Scanner;

class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiBookSales book = new MultiBookSales();

        book.accept(scanner);
        book.AllShow();

        scanner.close();
    }
}

class MultiBook {
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

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }
}

class MultiBookInfo extends MultiBook {
    double price;
    int stockInPosition;

    void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("Price: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("Stock in Position: ");
        stockInPosition = Integer.parseInt(scanner.nextLine());
    }

    void show() {
        super.show();
        System.out.println("Price: " + price);
        System.out.println("Stock in Position: " + stockInPosition);
    }
}

class MultiBookSales extends MultiBookInfo {
    int noOfCopiesSold;

    void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("No. of Copies Sold: ");
        noOfCopiesSold = Integer.parseInt(scanner.nextLine());
    }

    double RevenueGenerated() {
        return price * noOfCopiesSold;
    }

    void AllShow() {
        System.out.println("\nBook Sales Information:");
        show();
        System.out.println("No. of Copies Sold: " + noOfCopiesSold);
        System.out.println("Revenue Generated: " + RevenueGenerated());
    }
}