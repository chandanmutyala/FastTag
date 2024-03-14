package Service;

public interface FastTagRecharge {

        String recharge(String fastTagID,double amount) throws InvalidIDException;

}
