class BusStand {

    public static void board() {

        String busName = "KSRTC";
        int busNo = 101;
        String destination = "Mysore";

        Bus.transport(busName, busNo, destination);
    }
}