public class Car implements Vehicle {
    private int gear = 1;
    private int speed = 0;

    @Override
    public void changeGear(int a) {
        this.gear = a;
    }

    @Override
    public void speedUp(int a) {
        this.speed += a;
    }

    @Override
    public void slowDown(int a) {
        this.speed -= a;
    }
    public void display() {
        System.out.println("This Car`s speed: " + this.speed  + " km/h And Gear: " + this.gear);
    }
}