class StringFunctions {
    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring (5,16): " + str.substring(5,16));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace Java with C++: " + str.replace("Java","C++"));
        System.out.println("Starts with Java: " + str.startsWith("Java"));
        System.out.println("Ends with ming: " + str.endsWith("ming"));
    }
}
