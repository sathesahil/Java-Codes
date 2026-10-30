class Cube {
    int length;
    int breadth;
    int height;

    Cube() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    Cube(int side) {
        length = side;
        breadth = side;
        height = side;
    }

    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void show() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + (length * breadth * height));
        System.out.println();
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(3);
        Cube cube3 = new Cube(2, 4, 5);

        System.out.println("Cube 1:");
        cube1.show();

        System.out.println("Cube 2:");
        cube2.show();

        System.out.println("Cube 3:");
        cube3.show();
    }
}