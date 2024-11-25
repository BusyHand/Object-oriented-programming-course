package patterns.chain;

import static java.util.Arrays.stream;

public class Client {

    public static void main(String[] args) {

        AuthenticationHandler authenticationHandler = new UsernamePasswordAuthenticationHandler()
                .addNextHandler(new JwtAuthenticationHandler())
                .addNextHandler(new OauthAuthenticationHandler());

        stream(AuthenticationRequest.values())
                .map(request -> request.name().toLowerCase())
                .peek(request -> System.out.println("\nЗапрос c использованием: " + request + " авторизации."))
                .forEach(authenticationHandler::handle);
    }
}
