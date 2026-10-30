class Mobile {
    String company_name;
    double screen_size;

    Mobile(String c, double s) {
        company_name = c;
        screen_size = s;
    }

    void show() {
        System.out.println("Company Name = " + company_name);
        System.out.println("Screen Size = " + screen_size + " inches");
        System.out.println();
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", 6.5);
        Mobile mobile2 = new Mobile("Apple", 6.1);
        Mobile mobile3 = new Mobile("OnePlus", 6.7);
        Mobile mobile4 = new Mobile("Realme", 6.4);
        Mobile mobile5 = new Mobile("Xiaomi", 6.6);

        System.out.println("Mobile 1:");
        mobile1.show();

        System.out.println("Mobile 2:");
        mobile2.show();

        System.out.println("Mobile 3:");
        mobile3.show();

        System.out.println("Mobile 4:");
        mobile4.show();

        System.out.println("Mobile 5:");
        mobile5.show();
    }
}