public class EntityNotFoundException extends RuntimeException {

    private int errorCode;
    private String message;

    public EntityNotFoundException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public EntityNotFoundException(String message, int errorCode, String message1) {
        super(message);
        this.errorCode = errorCode;
        this.message = message1;
    }

    public EntityNotFoundException(String message, Throwable cause, int errorCode, String message1) {
        super(message, cause);
        this.errorCode = errorCode;
        this.message = message1;
    }

    public EntityNotFoundException(Throwable cause, int errorCode, String message) {
        super(cause);
        this.errorCode = errorCode;
        this.message = message;
    }

    public EntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.message = message1;
    }

    public EntityNotFoundException(int errorCode) {
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException() {

    }

}

