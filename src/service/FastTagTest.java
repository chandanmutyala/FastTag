package service;

import service.model.IdDetails;

public class FastTagTest {
    public static void main(String[] args) {
        IdDetails idDetails=new IdDetails();
        HighWayFastTag highWayFastTag=new HighWayFastTag();
       String mnt= highWayFastTag.recharge("1234455",500);
        System.out.println("amount ="+mnt);
        //System.out.println(idDetails.getWalletBalence());

    }
}
