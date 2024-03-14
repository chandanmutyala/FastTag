package Service;

public class FastTagInfo {
        private String fastTagId  = "1234";
        private int vehicleType = 4 ;
        private String vehicleNumber = "143" ;
        private double walletBalance =1000;

        public void setFastTadId(String fastTadId) {

            this.fastTagId = fastTagId;
        }

        public void setVehicleType(int vehicleType) {
            this.vehicleType = vehicleType;
        }

        public void setVehicleNumber(String vehicleNumber) {

            this.vehicleNumber = vehicleNumber;
        }



//    public FastTagIdDetails(String fastTadId, int vehicleType, String vehicleNumber, double walletBalance) {
//        this.fastTadId = fastTadId;
//        this.vehicleType = vehicleType;
//        this.vehicleNumber = vehicleNumber;
//        this.walletBalance = walletBalance;
//    }

        public String getFastTagId() {

            return fastTagId;
        }

        public int getVehicleType() {

            return vehicleType;
        }

        public String getVehicleNumber() {

            return vehicleNumber;
        }

        public double getWalletBalance() {

            return walletBalance;
        }

        public void setWalletBalance(double walletBalance) {

            this.walletBalance = walletBalance;
        }
    }

