package patterns.mediator;


//Todo
public class Client {
    public static void main(String[] args) {
        AirTrafficMediator mediator = new AirTrafficControllerConcreteMediator();

        Aircraft airplane1 = new Airplane(mediator, "A320");
        Aircraft helicopter1 = new Helicopter(mediator, "Bell 206");
        Aircraft airliner1 = new Airliner(mediator, "Boeing 747");

        airplane1.sendMessage("Прошу подтвердить расстояние до меня.");
        helicopter1.sendMessage("Я на высоте 1000 футов.");
        airliner1.sendMessage("Готов к взлету.");
    }
}
