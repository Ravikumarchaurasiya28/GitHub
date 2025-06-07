public class EnumMain {
    public static void main(String[] args) {
        Level l = new Level();
        Level[] lArr = new Level.values();
        for(int i : lArr) System.out.println(i);
        if(l == Level.LOW) System.out.println("LOW");
        else if(l == Level.MEDIUM) System.out.println("MEDIUM");
        else System.out.println("HIGH");
    }
}
