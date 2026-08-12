class Machine {

    static void start() {
        System.out.println("Machine is starting.");
    }

    static void operate() {
        System.out.println("Machine is operating.");
    }

    static void process() {
        System.out.println("Machine is processing.");
    }

    static void stop() {
        System.out.println("Machine is stopping.");
    }

    static void service() {
        System.out.println("Machine is under service.");
    }

    public static void main(String[] args) {

        start();

        operate();
        operate();

        process();
        process();
        process();

        stop();
        stop();
        stop();
        stop();

        service();
        service();
        service();
        service();
        service();
		
		 Doll.keepSafe();
    }
}