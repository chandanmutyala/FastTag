package service.model;

public class IdDetails {
 private String fastTagId="1234455";
   private int numberOfWheels=4;
   private String vehicleNumber="9595";
   private double walletBalence=1500;

   public IdDetails(){

   }

    public IdDetails(String fastTagId, int numberOfWheels, String vehicleNumber, String walletBalence) {
        this.fastTagId = fastTagId;
        this.numberOfWheels = numberOfWheels;
        this.vehicleNumber = vehicleNumber;
        //this.walletBalence = walletBalence;
    }

    public String getFastTagId() {
        return fastTagId;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getWalletBalence() {
        return walletBalence;
    }

    public void setWalletBalence(double walletBalence) {
        this.walletBalence = walletBalence;
    }
}
