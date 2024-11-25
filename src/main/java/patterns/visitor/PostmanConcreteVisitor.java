package patterns.visitor;

public class PostmanConcreteVisitor implements PostmanVisitor {

    @Override
    public void visit(Bank bank) {
        System.out.println(bank.receiveMail());
    }

    @Override
    public void visit(House house) {
        System.out.println(house.receiveMail());
    }

    @Override
    public void visit(Factory factory) {
        System.out.println(factory.receiveMail());
    }
}
