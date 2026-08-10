class Cube {
    int side;

    // Default constructor
    Cube() {
        side = 1;
    }

    // Parameterized constructor
    Cube(int s) {
        side = s;
    }

    void display() {
        System.out.println("Volume: " + (side * side * side));
    }

    public static void main(String[] args) {
        // No user input, just clean object creation
        Cube c1 = new Cube();    // Uses 1
        Cube c2 = new Cube(5);   // Uses 5
        Cube c3 = new Cube(10);  // Uses 10

        c1.display();
        c2.display();
        c3.display();
    }
}