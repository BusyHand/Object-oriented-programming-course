package patterns.visitor;

// todo
public class Client {
    public static void main(String[] args) {
        Place bank = new Bank();
        Place house = new House();
        Place factory = new Factory();

        PostmanVisitor postman = new PostmanConcreteVisitor();

        bank.accept(postman);
        house.accept(postman);
        factory.accept(postman);
    }
}
