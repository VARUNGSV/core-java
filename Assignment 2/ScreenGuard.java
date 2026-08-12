class ScreenGuard {

    static void clean() {
        System.out.println("Cleaning the screen.");
    }

    static void align() {
        System.out.println("Aligning the screen guard.");
    }

    static void apply() {
        System.out.println("Applying the screen guard.");
    }

    static void press() {
        System.out.println("Pressing to remove air bubbles.");
    }

    static void protect() {
        System.out.println("Screen guard is protecting the screen.");
    }

    public static void main(String[] args) {

        clean();

        align();
        align();

        apply();
        apply();
        apply();

        press();
        press();
        press();
        press();

        protect();
        protect();
        protect();
        protect();
        protect();
    }
}