package patterns.chain;

public class OauthAuthenticationHandler extends AuthenticationHandler{
    @Override
    public void handle(String request) {
        if (request.equals("oauth")) {
            System.out.println("Аутентификация с использованием OAuth.");
            return;
        }
        nextHandlers(request);
    }
}
