class Joystick {

    static void connect() {
        System.out.println("Joystick is connected.");
    }

    static void move() {
        System.out.println("Joystick is moving.");
    }

    static void pressButton() {
        System.out.println("Button is pressed.");
    }

    static void controlGame() {
        System.out.println("Controlling the game.");
    }

    static void disconnect() {
        System.out.println("Joystick is disconnected.");
    }

    public static void main(String[] args) {

        connect();

        move();
        move();

        pressButton();
        pressButton();
        pressButton();

        controlGame();
        controlGame();
        controlGame();
        controlGame();

        disconnect();
        disconnect();
        disconnect();
        disconnect();
        disconnect();
    }
}