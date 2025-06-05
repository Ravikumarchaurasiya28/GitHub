public class CarMain {
    public static void main(String[] args) {
        Car tata = new Car();
        tata.changeGear(2);
        tata.display();
        tata.speedUp(20);
        tata.display();
        tata.slowDown(10);
        tata.display();
    }
}