class Stone {

    static void details(String name, String color, double weight, int price, String origin, boolean polished, String type) {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Polished: " + polished);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {

        Stone.details("Granite", "Black", 5.5, 800, "India", true, "Natural");

        details("Marble", "White", 6.0, 1200, "Italy", true, "Artificial");
    }
}