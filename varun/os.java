class OS {
    public static void main(String[] args) {

        String name = "Windows";
        String version = "11";
        String developer = "Microsoft";
        String kernel = "Windows NT";
        String architecture = "64-bit";
        double storageRequired = 64.0;
        double ramRequired = 4.0;
        boolean multitasking = true;
        String fileSystem = "NTFS";
        double price = 10999.0;

        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Kernel: " + kernel);
        System.out.println("Architecture: " + architecture);
        System.out.println("Storage Required (GB): " + storageRequired);
        System.out.println("RAM Required (GB): " + ramRequired);
        System.out.println("Multitasking: " + multitasking);
        System.out.println("File System: " + fileSystem);
        System.out.println("Price: " + price);
    }
}