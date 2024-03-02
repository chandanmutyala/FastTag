package service;

import service.model.IdDetails;

public class HighWayFastTag implements FastTagService{
    IdDetails idDetails;
    int charges;
    public HighWayFastTag(){
        this.idDetails=new IdDetails();
    }
    @Override
    public String recharge(String fastTagId, double amount) {
        if(fastTagId.equals(idDetails.getFastTagId())){
            idDetails.setWalletBalence(idDetails.getWalletBalence()+amount);
            System.out.println(idDetails.getWalletBalence());
            return "recharge successful";
        }else{
            return "recharge failed";
        }

    }

    @Override
    public double payment() {

            if (idDetails.getNumberOfWheels() == 4) {
                charges = 120;
                if (idDetails.getWalletBalence() >= charges) {
                   idDetails.setWalletBalence(idDetails.getWalletBalence() - charges);
                    System.out.println(idDetails.getWalletBalence());
                    return charges;
                } else {
                    System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
                }

            } else if (idDetails.getNumberOfWheels() == 6) {
                charges = 250;
                if (idDetails.getWalletBalence() >= charges) {
                    idDetails.setWalletBalence(idDetails.getWalletBalence() - charges);
                    System.out.println("Toll charges  :"+charges+"   & "+  "Wallet balance :  "+idDetails.getWalletBalence());
                    return charges;
                } else {
                    System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
                }
            } else if (idDetails.getNumberOfWheels() == 10) {
                charges = 400;
                if (idDetails.getWalletBalence() >= charges) {
                    idDetails.setWalletBalence(idDetails.getWalletBalence() - charges);
                    System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+idDetails.getWalletBalence());
                    return charges;
                } else {
                    System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
                }
            } else {
                charges = 700;
                if (idDetails.getWalletBalence() >= charges) {
                    idDetails.setWalletBalence(idDetails.getWalletBalence() - charges);
                    System.out.println("Toll charges  :"+charges+"   & "+"Wallet balance :  "+idDetails.getWalletBalence());
                    return charges;
                } else {
                    System.out.println("Insufficient funds  Please make FAST-TAG RECHARGE");
                }
            }

            return 0;
        }
}
