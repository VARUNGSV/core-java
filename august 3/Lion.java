class Lion {

    static void details(String name, int age, double weight, String gender, String habitat, boolean wild, int speed, String color, int teeth) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Habitat: " + habitat);
        System.out.println("Wild: " + wild);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Teeth: " + teeth);
    }

    public static void main(String[] args) {

        Lion.details("Simba", 8, 190.5, "Male", "Forest", true, 80, "Golden", 30);

        details("Leo", 6, 175.0, "Male", "Savannah", true, 75, "Brown", 28);
    }
}