class Hardware {

    static void install() {
        System.out.println("Installing hardware.");
    }

    static void connect() {
        System.out.println("Connecting hardware.");
    }

    static void test() {
        System.out.println("Testing hardware.");
    }

    static void repair() {
        System.out.println("Repairing hardware.");
    }

    static void upgrade() {
        System.out.println("Upgrading hardware.");
    }

    public static void main(String[] args) {

        install();

        connect();
        connect();

        test();
        test();
        test();

        repair();
        repair();
        repair();
        repair();

        upgrade();
        upgrade();
        upgrade();
        upgrade();
        upgrade();
    }
}