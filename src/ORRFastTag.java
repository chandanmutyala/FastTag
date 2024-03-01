import model.FastTagIdDetails;

public class ORRFastTag implements FastTagEEservice{
    FastTagIdDetails fastTagIdDetails;
    double charges;
    @Override
    public double entryExit(int entryToll,int exitToll) {
        int distance = (exitToll-entryToll)*10;
        charges = distance*10;
        return distance;
    }

    public ORRFastTag() {
        this.fastTagIdDetails = new FastTagIdDetails();
    }


    @Override
    public String recharge(String fastTagId, double amount) {
        if (fastTagId.equals(fastTagIdDetails.getFastTadId())){
            fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() + amount);


            return "Your Recharge was successfull - Current Wallet Balance  :"+fastTagIdDetails.getWalletBalance();
        }else {
            System.out.println("Your Recharge was unsuccessfull(fasttag id not valid) - Corrent Wallet Balance  :"+fastTagIdDetails.getWalletBalance());
            return null;
        }
    }

    @Override
    public double payment() {
        this.entryExit(5,9);
        if (fastTagIdDetails.getVehicleType()<=4){
            charges = charges +100;
            if (fastTagIdDetails.getWalletBalance() >= charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        } else if (fastTagIdDetails.getVehicleType()<=6) {
            charges = charges +200;
            if (fastTagIdDetails.getWalletBalance() == charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        } else if (fastTagIdDetails.getVehicleType()<=10) {
            charges = charges +300;
            if (fastTagIdDetails.getWalletBalance() == charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        }else {
            if (fastTagIdDetails.getWalletBalance() == charges) {
                charges = charges+700;
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        }
        return 0;
    }
}
