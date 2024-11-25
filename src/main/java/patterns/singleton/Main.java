package patterns.singleton;

import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.SQLException;
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        H2Database dbInstance = H2Database.getInstance();

        dbInstance.ddlQuery("CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(255));");
        dbInstance.ddlQuery("INSERT INTO users (id, name) VALUES (1, 'John');");
        String result = dbInstance.dmlQuery(
                statement -> {
                    ResultSet resultSet = null;
                    try {
                        resultSet = statement.executeQuery("SELECT * FROM users;");
                        resultSet.next();
                        String id = resultSet.getString(1);
                        String name = resultSet.getString(2);
                        return "User id = " + id + ", name = " + name;
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        System.out.println(result);

        H2Database dbInstance2 = H2Database.getInstance();
        System.out.println(dbInstance == dbInstance2);
    }
}
