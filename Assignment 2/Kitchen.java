class Kitchen {

    static void cook() {
        System.out.println("Cooking food.");
    }

    static void wash() {
        System.out.println("Washing utensils.");
    }

    static void cut() {
        System.out.println("Cutting vegetables.");
    }

    static void serve() {
        System.out.println("Serving the food.");
    }

    static void clean() {
        System.out.println("Cleaning the kitchen.");
    }

    public static void main(String[] args) {
        cook();

        wash();
        wash();

        cut();
        cut();
        cut();

        serve();
        serve();
        serve();
        serve();

        clean();
        clean();
        clean();
        clean();
        clean();
    }
}