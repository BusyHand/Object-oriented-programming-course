package patterns.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new PoorHouseBuilder());
        House poorHouse = director.buildHouse();
        System.out.println(poorHouse);

        director = new Director(new RichHouseBuilder());
        House richHouse = director.buildHouse();
        System.out.println(richHouse);
    }
}
