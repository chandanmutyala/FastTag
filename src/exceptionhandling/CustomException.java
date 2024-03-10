package exceptionhandling;

public class CustomException extends Exception{
    private String code;

    public CustomException(String code,String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
