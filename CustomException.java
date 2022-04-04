package activities;

public class CustomException extends Exception {
    private String message = null;

    public CustomException(String customMessage) {
        this.message = customMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
