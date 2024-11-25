package patterns.visitor;

public class Bank extends Place {

    @Override
    void accept(PostmanVisitor postmanVisitor) {
        postmanVisitor.visit(this);
    }

    public String receiveMail() {
        return "Банк получил почту.";
    }
}
