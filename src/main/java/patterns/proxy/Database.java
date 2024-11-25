package patterns.proxy;

public interface Database {

    String save(String value);

    String update(Integer id, String value);

    String delete(Integer id, String value);

    String readById(Integer id);
}
