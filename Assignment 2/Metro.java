class Metro {

    static void start() {
        System.out.println("Metro is starting.");
    }

    static void arrive() {
        System.out.println("Metro arrived at the station.");
    }

    static void openDoor() {
        System.out.println("Metro doors are opened.");
    }

    static void travel() {
        System.out.println("Metro is travelling.");
    }

    static void stop() {
        System.out.println("Metro journey is completed.");
    }

    public static void main(String[] args) {

        start();

        arrive();
        arrive();

        openDoor();
        openDoor();
        openDoor();

        travel();
        travel();
        travel();
        travel();

        stop();
        stop();
        stop();
        stop();
        stop();
    }
}