package patterns.proxy;

//Todo
public class Client {

    public static void main(String[] args) {
        Database inMemoryDatabase = new DatabaseImpl();
        ProxyTransactionDatabaseImpl transactionDatabase = new ProxyTransactionDatabaseImpl(inMemoryDatabase);

        System.out.println("Сохранение записи: Запись 1");
        String saveResult = transactionDatabase.save("Запись 1");
        System.out.println("Результат сохранения: " + saveResult + "\n");

        System.out.println("Чтение записи с ID 0:");
        String readResult = transactionDatabase.readById(0);
        System.out.println("Результат чтения: " + readResult + "\n");

        System.out.println("Чтение записи с ID 1:");
        String readNotSavedResult = transactionDatabase.readById(1);
        System.out.println("Результат чтения: " + readNotSavedResult + "\n");

        System.out.println("Обновление записи с ID 0:");
        String updateResult = transactionDatabase.update(0, "Обновленная Запись 1");
        System.out.println("Результат обновления: " + updateResult + "\n");

        System.out.println("Обновление записи с ID 1:");
        String updateNotContainedResult = transactionDatabase.update(1, "Обновленная Запись 1");
        System.out.println("Результат обновления: " + updateNotContainedResult + "\n");

        System.out.println("Чтение обновленной записи с ID 0:");
        String readUpdatedResult = transactionDatabase.readById(0);
        System.out.println("Результат чтения обновленной записи: " + readUpdatedResult + "\n");

        System.out.println("Удаление записи с ID 0:");
        String deleteResult = transactionDatabase.delete(0, "Удаленная Запись");
        System.out.println("Результат удаления: " + deleteResult + "\n");

        System.out.println("Чтение удаленной записи с ID 0:");
        String readDeletedResult = transactionDatabase.readById(0);
        System.out.println("Результат чтения удаленной записи: " + readDeletedResult + "\n");

    }
}
