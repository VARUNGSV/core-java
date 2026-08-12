class Logo {

    static void details(String company, String color, String shape, int year, boolean registered) {
        System.out.println("Company: " + company);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Year: " + year);
        System.out.println("Registered: " + registered);
    }

    public static void main(String[] args) {

        Logo.details("Nike", "Black", "Tick", 1971, true);

        details("Apple", "Silver", "Apple", 1976, true);
    }
}