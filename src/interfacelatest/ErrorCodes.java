package interfacelatest;

public enum ErrorCodes {
    NEOTERIC_INVALID_OTP_1000("NEO_IV_1000","Invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEO_ERR_1000","Expired OTP");
    String code;
    String message;
    ErrorCodes(String errorCode,String message){
        this.code=errorCode;
        this.message=message;
    }

   public String getCode(){
        return code;
   }
    public String getMessage(){
        return message;
    }
}
