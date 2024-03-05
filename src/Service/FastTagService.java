package Service;

public abstract class FastTagService implements FastTagRecharge,FastTagTollCalculate,FastTagPayment {
    FastTagInfo fastTagInfo;
    double tollCharges;

    public FastTagService(){
        this.fastTagInfo = new FastTagInfo();
    }
    @Override
    public String recharge(String fastTagID , double amount) {
        System.out.println("Wallet Balance  :"+fastTagInfo.getWalletBalance());
        if (fastTagID.equals(fastTagInfo.getFastTagId())) {
            fastTagInfo.setWalletBalance(fastTagInfo.getWalletBalance() + amount);
            System.out.println("Your Recharge was successfull - Current Wallet Balance  :" + fastTagInfo.getWalletBalance());

            return "Your Recharge was successfull - Current Wallet Balance  :" + fastTagInfo.getWalletBalance();
        } else {
            System.out.println("Your Recharge was unsuccessfull(fasttag id not valid) - Corrent Wallet Balance  :" + fastTagInfo.getWalletBalance());
            return null;
        }

    }

    @Override
    public double payment() {
        if (fastTagInfo.getWalletBalance()>=tollCharges){
            fastTagInfo.setWalletBalance(fastTagInfo.getWalletBalance()-tollCharges);
            System.out.println("Toll charges  :"+tollCharges+"   & "+"Wallet balance :  "+fastTagInfo.getWalletBalance());

        }else {
            System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
        }
        return fastTagInfo.getWalletBalance();
    }
}
