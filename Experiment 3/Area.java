class Area {
    int length;
    int breadth;
    int radius;
    int side;

    Area(int l, int b, int r, int s) {
        length = l;
        breadth = b;
        radius = r;
        side = s;
    }

    Area(Area a) {
        length = a.length;
        breadth = a.breadth;
        radius = a.radius;
        side = a.side;
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Radius = " + radius);
        System.out.println("Side = " + side);
        System.out.println("Area of Rectangle = " + (length * breadth));
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
        System.out.println("Area of Square = " + (side * side));
    }
}

class AreaMain {
    public static void main(String[] args) {
        Area a1 = new Area(10, 5, 7, 4);

        Area a2 = new Area(a1);

        System.out.println("Original Object:");
        a1.display();

        System.out.println();

        System.out.println("Copied Object:");
        a2.display();
    }
}