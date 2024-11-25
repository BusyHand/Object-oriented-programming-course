package patterns.visitor;

public abstract class Place {
    abstract void accept(PostmanVisitor postmanVisitor);
}
