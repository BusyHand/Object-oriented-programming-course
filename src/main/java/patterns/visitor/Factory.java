package patterns.visitor;

public class Factory extends Place {
    @Override
    void accept(PostmanVisitor postmanVisitor) {
        postmanVisitor.visit(this);
    }

    public String receiveMail() {
        return "Завод получил почту.";
    }
}