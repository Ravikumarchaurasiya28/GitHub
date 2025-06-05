public class OuterMain {
    public static void main(String[] args) {
        OuterClass c = new OuterClass();
        OuterClass.InnerClass in = c.new InnerClass();
        c.inner();
        in.display();
        System.out.println();
    }
}
