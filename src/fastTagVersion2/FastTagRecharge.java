package fastTagVersion2;

import fastTagVersion2.model.InvalidIDException;

public interface FastTagRecharge {
    String recharge(String fastTagID,double amount) throws InvalidIDException;
}
