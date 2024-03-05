package Service;

public class FastTagTest {
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
