class Coffee {

    static void prepare() {
        System.out.println("Preparing coffee.");
    }

    static void boilMilk() {
        System.out.println("Boiling milk.");
    }

    static void addPowder() {
        System.out.println("Adding coffee powder.");
    }

    static void mix() {
        System.out.println("Mixing the coffee.");
    }

    static void serve() {
        System.out.println("Serving coffee.");
    }

    public static void main(String[] args) {

        prepare();

        boilMilk();
        boilMilk();

        addPowder();
        addPowder();
        addPowder();

        mix();
        mix();
        mix();
        mix();

        serve();
        serve();
        serve();
        serve();
        serve();
    }
}