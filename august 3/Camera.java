class Camera {

    static void details(String brand, String model, int mp, int zoom, int price, boolean flash, String color, double weight) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("MP: " + mp);
        System.out.println("Zoom: " + zoom);
        System.out.println("Price: " + price);
        System.out.println("Flash: " + flash);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {

        Camera.details("Canon", "EOS", 24, 10, 55000, true, "Black", 0.75);

        details("Sony", "Alpha", 32, 20, 85000, true, "Silver", 0.82);
    }
}