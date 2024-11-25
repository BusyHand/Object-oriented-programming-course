package patterns.observer;

public class UserObserver implements Observer {
    private final String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Подписчик " + name + " получил уведомление о новом видео: " + videoTitle);
    }
}
