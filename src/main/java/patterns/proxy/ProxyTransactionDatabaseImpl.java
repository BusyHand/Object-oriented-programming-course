package patterns.proxy;

import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

@RequiredArgsConstructor
public class ProxyTransactionDatabaseImpl implements Database {

    private final Database database;

    @Override
    public String save(String value) {
        final Integer NOT_USE = Integer.MAX_VALUE;
        return transaction(NOT_USE, value, (id, newValue) -> database.save(newValue));
    }

    @Override
    public String update(Integer id, String value) {
        return transaction(id, value, database::update);
    }

    @Override
    public String delete(Integer id, String value) {
        return transaction(id, value, database::delete);
    }

    @Override
    public String readById(Integer id) {
        return database.readById(id);
    }

    private String transaction(Integer id, String value, BiFunction<Integer, String, String> transaction) {
        try {
            System.out.println("Transaction start");
            String result = transaction.apply(id, value);
            System.out.println("Transaction commit");
            return result;
        } catch (Exception e) {
            System.out.println("!ERROR Transaction rollback, due error: " + e.getMessage());
            return "";
        }
    }

}
