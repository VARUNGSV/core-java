class PenDrive {

    static void insert() {
        System.out.println("PenDrive is inserted.");
    }

    static void copyData() {
        System.out.println("Copying data to PenDrive.");
    }

    static void readData() {
        System.out.println("Reading data from PenDrive.");
    }

    static void remove() {
        System.out.println("PenDrive is removed safely.");
    }

    static void store() {
        System.out.println("PenDrive is stored safely.");
    }

    public static void main(String[] args) {

        insert();

        copyData();
        copyData();

        readData();
        readData();
        readData();

        remove();
        remove();
        remove();
        remove();

        store();
        store();
        store();
        store();
        store();
    }
}