public class OuterClass {
    public class InnerClass {
        public void display() {
            System.out.println("Hello this is Inner class");
        }
    }
    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }
}