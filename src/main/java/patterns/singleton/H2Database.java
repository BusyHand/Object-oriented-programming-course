package patterns.singleton;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;

public class H2Database {

    private final Connection connection;

    /**
     * В Java загрузка классов и инициализация статических полей выполняется только при первом обращении к классу.
     */
    private static class H2ConnectionSingletonHolder {
        private static final H2Database INSTANCE = new H2Database();
    }

    public static H2Database getInstance() {
        return H2ConnectionSingletonHolder.INSTANCE;
    }

    @SneakyThrows
    private H2Database() {
        String url = "jdbc:h2:mem:testdb;MODE=PostgreSQL";
        String user = "sa";
        String password = "";

        //В учебных целях only
        this.connection = DriverManager.getConnection(url, user, password);
    }

    public String dmlQuery(Function<Statement, String> query) {
        try (Statement stmt = connection.createStatement()) {
            String result = query.apply(stmt);
            System.out.println("Запрос выполнен");
            return result;
        } catch (SQLException e) {
            System.err.println("Запрос не выполнен");
            return null;
        }
    }

    public void ddlQuery(String query) {
        try (Statement stmt = connection.createStatement()) {
            int i = stmt.executeUpdate(query);
            System.out.println("Запрос выполнен: " + query + "\nКоличество измененных строк: " + i);
        } catch (SQLException e) {
            System.err.println("Запрос не выполнен: " + query);
        }
    }


}
