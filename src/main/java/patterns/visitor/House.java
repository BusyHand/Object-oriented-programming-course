package patterns.visitor;

public class House extends Place {
    @Override
    void accept(PostmanVisitor postmanVisitor) {
        postmanVisitor.visit(this);
    }

    public String receiveMail() {
        return "Частный дом получил почту.";
    }
}