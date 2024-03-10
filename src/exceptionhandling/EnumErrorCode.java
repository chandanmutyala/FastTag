package exceptionhandling;

public enum EnumErrorCode {
   NEOTERIC_EVEN_1000("Neo_Even_1000","Even Number"),
    NEOTERIC_ODD_1001("Neo_Odd_1001","Odd Number");
  private String code;
 private String message;

   EnumErrorCode(String errorCode,String message){
       this.code=errorCode;
       this.message=message;
   }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
