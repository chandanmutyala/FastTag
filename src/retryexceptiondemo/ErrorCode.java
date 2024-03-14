package retryexceptiondemo;

public enum ErrorCode {
    TIMEOUT_ERROR_CODE("1000","TimeOut Exception"),
    INSUFFICIENT_FUNDS_ERROR_CODE("1001","Insufficient funds Exception");
    private String code;
    private String message;
    ErrorCode(String code,String message){
        this.code=code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
