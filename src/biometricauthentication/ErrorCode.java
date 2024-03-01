package biometricauthentication;

public enum ErrorCode {
    BIOMETRIC_VALID_1001("BIOMETRIC_VALID_1001","Invalid Password"),
    BIOMETRIC_INVALID_1002("BIOMETRIC_INVALID_1002","Invalid Password");

    String code;
    String message;

    ErrorCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }



}
