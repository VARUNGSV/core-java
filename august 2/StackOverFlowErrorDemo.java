class StackOverFlowErrorDemo {

    static void staticMethod1() {
        System.out.println("Inside staticMethod1");
        staticMethod2();
    }

    static void staticMethod2() {
        System.out.println("Inside staticMethod2");
        staticMethod1();
    }

    void nonStaticMethod1() {
        System.out.println("Inside nonStaticMethod1");
        nonStaticMethod2();
    }

    void nonStaticMethod2() {
        System.out.println("Inside nonStaticMethod2");
        nonStaticMethod1();
    }

    static void staticToNonStatic() {
        System.out.println("Inside staticToNonStatic");
        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
        obj.nonStaticMethod1();
    }

    void nonStaticToStatic() {
        System.out.println("Inside nonStaticToStatic");
        staticMethod1();
    }

    public static void main(String[] args) {

        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();

        try {
            staticMethod1();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Static to Static");
        }

        try {
            staticToNonStatic();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Static to Non-Static");
        }

        try {
            obj.nonStaticToStatic();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Non-Static to Static");
        }

        try {
            obj.nonStaticMethod1();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Non-Static to Non-Static");
        }
    }
}