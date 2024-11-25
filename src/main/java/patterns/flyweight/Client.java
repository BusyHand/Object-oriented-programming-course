package patterns.flyweight;

//TODO
public class Client {

    public static void main(String[] args) {
        ObjectFactory objectFactory = new ObjectFactory();

        ObjectExample firstObject = objectFactory.createObjectExample("Key 1");
        ObjectExample secondObject = objectFactory.createObjectExample("Key 2");
        System.out.println("firstObject = secondObject: " + (firstObject == secondObject));

        ObjectExample thirdObject = objectFactory.createObjectExample("Key 1");
        System.out.println("firstObject = thirdObject:  " + (firstObject == thirdObject));

    }
}
