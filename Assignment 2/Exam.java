class Exam 
{
	static void prepare() {
        System.out.println("Preparing for the exam.");
    }

    static void write() {
        System.out.println("Writing the exam.");
    }

    static void review() {
        System.out.println("Reviewing the answers.");
    }

    static void submit() {
        System.out.println("Submitting the answer sheet.");
    }

    static void result() {
        System.out.println("Exam result is declared.");
    }

    public static void main(String[] args) {

        prepare();

        write();
        write();

        review();
        review();
        review();

        submit();
        submit();
        submit();
        submit();

        result();
        result();
        result();
        result();
        result();
    }
}