import model.FastTagIdDetails;

public class HighwayFastTag implements FastTagService {
    FastTagIdDetails fastTagIdDetails;
    double charges;

    public HighwayFastTag() {
        this.fastTagIdDetails = new FastTagIdDetails();
    }

    @Override
    public String recharge(String fastTagId, double amount) {
        if (fastTagId.equals(fastTagIdDetails.getFastTadId())) {
            fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() + amount);


            return "Your Recharge was successfull - Current Wallet Balance  :" + fastTagIdDetails.getWalletBalance();
        } else {
            System.out.println("Your Recharge was unsuccessfull(fasttag id not valid) - Corrent Wallet Balance  :" + fastTagIdDetails.getWalletBalance());
            return null;
        }

    }

    @Override
    public double payment() {

        if (fastTagIdDetails.getVehicleType() == 4) {
            charges = 120;
            if (fastTagIdDetails.getWalletBalance() >= charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println(fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }

        } else if (fastTagIdDetails.getVehicleType() == 6) {
            charges = 250;
            if (fastTagIdDetails.getWalletBalance() >= charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Toll charges  :"+charges+"   & "+  "Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        } else if (fastTagIdDetails.getVehicleType() == 10) {
            charges = 400;
            if (fastTagIdDetails.getWalletBalance() >= charges) {
                fastTagIdDetails.setWalletBalance(fastTagIdDetails.getWalletBalance() - charges);
                System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+fastTagIdDetails.getWalletBalance());
                return charges;
            } else {
                System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
            }
        } else {
            charges = 700;
            if (fastTagIdDetails.getWalletBalance() >= charges) {
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
