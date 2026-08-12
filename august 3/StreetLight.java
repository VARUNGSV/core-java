class StreetLight {

    static void details(String color, int poles) {
        System.out.println("Color: " + color);
        System.out.println("Number of Poles: " + poles);
    }

    public static void main(String[] args) {

        StreetLight.details("White", 25);

        details("Yellow", 30);
    }
}