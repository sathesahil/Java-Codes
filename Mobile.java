class Mobile {
    String companyName;
    double screenSize;

    Mobile(String name, double size) {
        companyName = name;
        screenSize = size;
    }

    Mobile(Mobile m) {
        companyName = m.companyName;
        screenSize = m.screenSize;
    }

    void display() {
        System.out.println(companyName + " - " + screenSize + " inches");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", 6.1);

        Mobile m2 = new Mobile("Samsung", 6.7);

        Mobile m3 = new Mobile("Google", 6.3);

        Mobile m4 = new Mobile("OnePlus", 6.5);
        
        Mobile m5 = new Mobile("Xiaomi", 6.6);

        System.out.println("Mobile Details:");
        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}