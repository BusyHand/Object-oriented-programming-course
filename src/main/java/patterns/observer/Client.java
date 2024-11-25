package patterns.observer;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        ChanelObservable videoPublisher = new ChanelObservable();

        Observer user1 = new UserObserver("Пользователь 1");
        Observer user2 = new UserObserver("Пользователь 2");
        Observer user3 = new UserObserver("Пользователь 3");

        videoPublisher.addAll(List.of(user1, user2, user3));

        videoPublisher.publishVideo("Стипендия ЮГУ");
        videoPublisher.publishVideo("Как сдать ООП");

        // user2 отчислен
        videoPublisher.remove(user2);

        videoPublisher.publishVideo("Как не отчислиться");
    }
}
