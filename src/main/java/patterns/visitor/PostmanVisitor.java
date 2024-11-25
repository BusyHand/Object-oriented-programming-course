package patterns.visitor;

public interface PostmanVisitor {
    void visit(Bank bank);

    void visit(House house);

    void visit(Factory factory);
}