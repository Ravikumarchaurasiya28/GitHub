public class Animal extends Dog{
    //public String voice;
    public void Voice() {
        System.out.println("Meowww...!");
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.printData();
        cat.Voice();
    }
}
