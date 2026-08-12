class Paper {

    static void write() {
        System.out.println("Writing on the paper.");
    }

    static void fold() {
        System.out.println("Folding the paper.");
    }

    static void cut() {
        System.out.println("Cutting the paper.");
    }

    static void draw() {
        System.out.println("Drawing on the paper.");
    }

    static void recycle() {
        System.out.println("Recycling the paper.");
    }

    public static void main(String[] args) {

        write();

        fold();
        fold();

        cut();
        cut();
        cut();

        draw();
        draw();
        draw();
        draw();

        recycle();
        recycle();
        recycle();
        recycle();
        recycle();
    }
}