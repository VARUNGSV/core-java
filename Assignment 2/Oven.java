class Oven {

    static void open() {
        System.out.println("Opening the oven.");
    }

    static void preheat() {
        System.out.println("Preheating the oven.");
    }

    static void bake() {
        System.out.println("Baking the food.");
    }

    static void turnOff() {
        System.out.println("Turning off the oven.");
    }

    static void clean() {
        System.out.println("Cleaning the oven.");
    }

    public static void main(String[] args) {

        open();

        preheat();
        preheat();

        bake();
        bake();
        bake();

        turnOff();
        turnOff();
        turnOff();
        turnOff();

        clean();
        clean();
        clean();
        clean();
        clean();
    }
}