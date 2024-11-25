package patterns.chain;

public class UsernamePasswordAuthenticationHandler extends AuthenticationHandler {

    @Override
    public void handle(String request) {
        if (request.equals("username_password")) {
            System.out.println("Аутентификация с использованием имени пользователя и пароля.");
            return;
        }
        nextHandlers(request);
    }
}
