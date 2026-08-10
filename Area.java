class Area {
    
    // Circle (No parameters)
    Area() {
        double r = 5.0;
        System.out.println("Circle: " + (3.14 * r * r));
    }

    // Square (Integer parameter)
    Area(int s) {
        System.out.println("Square: " + (s * s));
    }

    // Triangle (Double parameters)
    Area(double b, double h) {
        System.out.println("Triangle: " + (0.5 * b * h));
    }

    public static void main(String[] args) {
        new Area();          // Circle
        new Area(10);        // Square
        new Area(4.0, 6.0);  // Triangle
    }
}