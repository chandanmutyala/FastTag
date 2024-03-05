package Service;

public class ORRService extends FastTagService{

    FastTagInfo fastTagInfo;
    double charges;
    public ORRService(){
        this.fastTagInfo = new FastTagInfo();
    }

    public double entryExit(int entryToll,int exitToll) {
        int distance = (exitToll-entryToll)*10;
        charges = distance*10;
        return distance;
    }
    @Override
    public double tollCalculate() {

        this.entryExit(5,9);
        if (fastTagInfo.getVehicleType()<=4){
            charges = charges +100;
            tollCharges=charges;
        } else if (fastTagInfo.getVehicleType()<=6) {
            charges = charges +200;
            tollCharges=charges;

        } else if (fastTagInfo.getVehicleType()<=10) {
            charges = charges +300;
            tollCharges=charges;

        }else {
            charges = charges+700;
            tollCharges=charges;
        }  return 0;
    }
}
