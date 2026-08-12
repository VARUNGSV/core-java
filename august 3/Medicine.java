class Medicine {

    static void details(String name, String company, int tablets, int price, String expiry, boolean available) {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Tablets: " + tablets);
        System.out.println("Price: " + price);
        System.out.println("Expiry: " + expiry);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Medicine.details("Dolo650", "Micro Labs", 15, 35, "12/2027", true);

        details("Paracetamol", "Cipla", 10, 28, "09/2027", true);
    }
}