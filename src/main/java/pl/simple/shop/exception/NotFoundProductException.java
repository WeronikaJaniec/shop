package pl.simple.shop.exception;

public class NotFoundProductException extends WebApplicationException {
    public NotFoundProductException(String message) {
        super(message);
    }
}
