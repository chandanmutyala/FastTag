package fastTagVersion2.model;

import fastTagVersion2.HighWayService;
import fastTagVersion2.ORRService;

public class Test {
    public static void main(String[] args) {
        ORRService orrService = new ORRService();
        orrService.recharge("1234",500);
        orrService.tollCalculate();
        orrService.payment();
        HighWayService highWayService = new HighWayService();
        highWayService.recharge("1234",900);
        highWayService.tollCalculate();
        highWayService.payment();


    }
}
