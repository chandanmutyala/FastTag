package Service;

public class HighWayService extends FastTagService{

        FastTagInfo fastTagInfo;
        double charges;
        public HighWayService(){
            this.fastTagInfo=new FastTagInfo();
        }

        @Override
        public double tollCalculate() {
            if (fastTagInfo.getVehicleType() == 4) {
                charges = 120;
                tollCharges=charges;


            } else if (fastTagInfo.getVehicleType() == 6) {
                charges = 250;
                tollCharges=charges;

            } else if (fastTagInfo.getVehicleType() == 10) {
                charges = 400;
                tollCharges=charges;

            } else {
                charges = 700;
                tollCharges=charges;

            }

            return 0;
        }

    }

