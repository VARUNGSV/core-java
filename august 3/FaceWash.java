class FaceWash {

    static void details(String brand, String type, int quantity, int price) {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        FaceWash.details("Garnier", "Oil Control", 100, 220);

        details("Himalaya", "Neem", 150, 180);
    }
}