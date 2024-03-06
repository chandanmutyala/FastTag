package fastTagVersion2.model;

public class InsufficentWalletBalance  extends  Exception{
    String code;
    public InsufficentWalletBalance(String errorCode,String message){
        super(message);
        this.code = errorCode;
    }
    public  String getCode(){
        return code;
    }
}
