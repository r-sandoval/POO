package exceptions;

public class RutInvalidoException extends Exception {
    public RutInvalidoException() {
    }

    public RutInvalidoException(String message) {
        super(message);
    }

    public RutInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public RutInvalidoException(Throwable cause) {
        super(cause);
    }

    public RutInvalidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
