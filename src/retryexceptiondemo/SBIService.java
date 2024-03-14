package retryexceptiondemo;

public class SBIService {
    int i=0;
    public String transfer(){
        i=i+1;
        System.out.println("SBIService i value "+i);
        if(i%2==0){
            throw new InsufficientFundsException(ErrorCode.INSUFFICIENT_FUNDS_ERROR_CODE.getCode(),
                    ErrorCode.INSUFFICIENT_FUNDS_ERROR_CODE.getMessage());
        }else{
            throw new TimeOutException(ErrorCode.TIMEOUT_ERROR_CODE.getCode(),
                    ErrorCode.TIMEOUT_ERROR_CODE.getMessage());
        }
    }
}
