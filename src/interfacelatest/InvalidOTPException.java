package interfacelatest;

public class InvalidOTPException extends Exception{
    private String code;

    public InvalidOTPException(String errorCode, String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }

}
