public class Pen {
    public static void main(String[] args) {
       oopsPen p = new oopsPen();
       p.color = "red";
       p.type = "ball";
       p.write();
       p.printData();
    }
}
class oopsPen {
    String color, type;
    public void write() {
        System.out.println("Writing Something...");
    }
    public void printData() {
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }
}