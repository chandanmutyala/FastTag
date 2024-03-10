package interfacelatest;

public class InvalidRunTimeException extends RuntimeException{
    private final String code;

    public InvalidRunTimeException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
    public String getCode() {
        return code;

    }

}
