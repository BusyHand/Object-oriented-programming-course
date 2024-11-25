package patterns.chain;

public class JwtAuthenticationHandler extends AuthenticationHandler {
    @Override
    public void handle(String request) {
        if (request.equals("jwt")) {
            System.out.println("Аутентификация с использованием токена.");
            return;
        }
        nextHandlers(request);
    }
}
