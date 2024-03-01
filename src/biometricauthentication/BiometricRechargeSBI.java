package biometricauthentication;

public class BiometricRechargeSBI extends BiometricService{
         BiometricRechargeSBI(){
             this.biometricUserDetails=new BiometricUserDetails();
            }
    @Override
    String recharge(String userId,int amount) {
        if (biometricUserDetails.getUserId().equals(userId)) {
        int recharged=biometricUserDetails.getWalletBal()+amount;
            System.out.println("Total Amount in wallet after recharge"+recharged);
            System.out.println(" Recharge successful "+recharged);

        }   else {

            System.out.println(" Recharge failed ");
        }
        return "";

    }


}
