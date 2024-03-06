package fastTagVersion2;

import fastTagVersion2.model.ErrorCode;
import fastTagVersion2.model.FastTagInfo;
import fastTagVersion2.model.InsufficentWalletBalance;
import fastTagVersion2.model.InvalidIDException;


public abstract class FastTagService implements FastTagRecharge,FastTagTollCalculate,FstTagPayment{
    FastTagInfo fastTagInfo;
    double tollCharges;

    public FastTagService(){
        this.fastTagInfo = new FastTagInfo();
    }
    @Override
    public String recharge(String fastTagID , double amount) throws InvalidIDException {
        System.out.println("Wallet Balance  :"+fastTagInfo.getWalletBalance());
            if (fastTagID.equals(fastTagInfo.getFastTadId())) {
                fastTagInfo.setWalletBalance(fastTagInfo.getWalletBalance() + amount);
                System.out.println("Your Recharge was successfull - Current Wallet Balance  :" + fastTagInfo.getWalletBalance());

                return "Your Recharge was successfull - Current Wallet Balance  :" + fastTagInfo.getWalletBalance();
            } else {
            throw new InvalidIDException(ErrorCode.FASTTAG_INVALID_ID_001.getCode(), ErrorCode.FASTTAG_INVALID_ID_001.getMessage());
           // System.out.println("Your Recharge was unsuccessfull(fasttag id not valid) - Corrent Wallet Balance  :" + fastTagInfo.getWalletBalance());
           // return null;
        }

    }

    @Override
    public double payment() throws InsufficentWalletBalance {
        if (fastTagInfo.getWalletBalance()>=tollCharges){
            fastTagInfo.setWalletBalance(fastTagInfo.getWalletBalance()-tollCharges);
            System.out.println("Toll charges  :"+tollCharges+"   & "+"Wallet balance :  "+fastTagInfo.getWalletBalance());

        }else {
            throw new InsufficentWalletBalance(ErrorCode.FASTTAG_PAYMENT_ERROR_002.getCode(),
                    ErrorCode.FASTTAG_PAYMENT_ERROR_002.getMessage());
            //System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
        }
        return fastTagInfo.getWalletBalance();
    }
}
