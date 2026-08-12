class Mascara {

    static void details(String brand, String color, double volume, int price, boolean waterproof, String type, String expiry, String country, int rating, boolean available) {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Volume: " + volume);
        System.out.println("Price: " + price);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Type: " + type);
        System.out.println("Expiry: " + expiry);
        System.out.println("Country: " + country);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Mascara.details("Maybelline", "Black", 9.5, 499, true, "Volume", "12/2027", "India", 5, true);

        details("Lakme", "Brown", 8.0, 399, false, "Curl", "08/2027", "India", 4, true);
    }
}