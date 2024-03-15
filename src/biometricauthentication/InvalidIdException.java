package biometricauthentication;

public class InvalidIdException extends Exception{
    String code;

    public InvalidIdException(String errorCode, String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }

}
