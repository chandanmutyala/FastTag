package fastTagVersion2.model;

import fastTagVersion2.HighWayService;
import fastTagVersion2.ORRService;

public class Test {
    public static void main(String[] args) {
        ORRService orrService = new ORRService();
        try {
            orrService.recharge("123",500);
        } catch (InvalidIDException e) {
            System.out.println(e.getCode());;
        }
        orrService.tollCalculate();
        try {
            orrService.payment();
        } catch (InsufficentWalletBalance e) {
            System.out.println(e.getCode());
        }finally {
            System.out.println("Hai i am from finally block");
        }
//        HighWayService highWayService = new HighWayService();
//        highWayService.recharge("1234",900);
//        highWayService.tollCalculate();
//        highWayService.payment();


    }
}
