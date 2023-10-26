package fr.banque;

public class BanqueException extends Exception{
    public BanqueException() {
    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public BanqueException(Throwable cause) {
        super(cause);
    }
}
