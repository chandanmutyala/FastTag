package fastTagVersion2.model;

public class InvalidIDException extends Exception {
    String code;
    public InvalidIDException(String errorCode, String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }
}
