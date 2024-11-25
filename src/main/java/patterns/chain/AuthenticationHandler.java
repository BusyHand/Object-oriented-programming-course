package patterns.chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AuthenticationHandler {

    private final List<AuthenticationHandler> authenticationHandlers;

    public AuthenticationHandler() {
        this.authenticationHandlers = new ArrayList<>();
    }

    public abstract void handle(String request);

    public void nextHandlers(String request) {
        authenticationHandlers.forEach(handler -> handler.handle(request));
    }

    public AuthenticationHandler addNextHandler(AuthenticationHandler authenticationHandler) {
        authenticationHandlers.add(authenticationHandler);
        return this;
    }

    public AuthenticationHandler removeNextHandler(AuthenticationHandler authenticationHandler) {
        authenticationHandlers.remove(authenticationHandler);
        return this;
    }

}
