public class Hangar {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 10000);
        Boat charles = new Boat("Porte-avion", 250000);

        System.out.println(mercedes.doStuff());
        System.out.println(charles.doStuff());
    }
}
