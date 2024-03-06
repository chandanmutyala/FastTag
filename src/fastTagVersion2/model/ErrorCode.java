package fastTagVersion2.model;

public enum ErrorCode {
    FASTTAG_INVALID_ID_001("FASTTAG_IVID_001","INVALID PASSWORD"),
    FASTTAG_PAYMENT_ERROR_002("FASTTAG_PAYMENT_ERROR_002","INVALID PASSWORD");


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
