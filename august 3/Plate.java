class Plate {

    static void details(String material, String shape, int price) {
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Plate.details("Steel", "Round", 250);

        details("Glass", "Square", 350);
    }
}