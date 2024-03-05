package Service;

public class FastTagInfo {
        private String fastTadId  = "1234";
        private int vehicleType = 8 ;
        private String vehicleNumber = "143" ;
        private double walletBalance =1000;

        public void setFastTadId(String fastTadId) {
            this.fastTadId = fastTadId;
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

        public String getFastTadId() {
            return fastTadId;
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

