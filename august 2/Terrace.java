class Terrace {

    static String type = "Open";
    static double area = 1200.50;
    static String flooring = "Tiles";
    static int floors = 1;
    static boolean waterTank = true;
    static boolean solarPanel = true;
    static boolean garden = false;
    static int chairs = 10;
    static int tables = 2;
    static int lights = 8;
    static int cameras = 2;
    static String railing = "Steel";
    static String paintColor = "White";
    static boolean covered = false;
    static int doors = 1;
    static int windows = 0;
    static String owner = "Ramesh";
    static String location = "Bangalore";
    static double height = 15.5;
    static String usage = "Party";

    static void display() {
        System.out.println("Type : " + type);
        System.out.println("Area : " + area);
        System.out.println("Flooring : " + flooring);
        System.out.println("Floors : " + floors);
        System.out.println("Water Tank : " + waterTank);
        System.out.println("Solar Panel : " + solarPanel);
        System.out.println("Garden : " + garden);
        System.out.println("Chairs : " + chairs);
        System.out.println("Tables : " + tables);
        System.out.println("Lights : " + lights);
        System.out.println("Cameras : " + cameras);
        System.out.println("Railing : " + railing);
        System.out.println("Paint Color : " + paintColor);
        System.out.println("Covered : " + covered);
        System.out.println("Doors : " + doors);
        System.out.println("Windows : " + windows);
        System.out.println("Owner : " + owner);
        System.out.println("Location : " + location);
        System.out.println("Height : " + height);
        System.out.println("Usage : " + usage);
    }
}