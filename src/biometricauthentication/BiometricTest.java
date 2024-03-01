package biometricauthentication;

public class BiometricTest {
    public static void main(String[] args) {

        BiometricRechargeSBI biometricRecharge=new BiometricRechargeSBI();
        biometricRecharge.recharge("asdfghk",450);

        try {
            biometricRecharge.registration("female",18);
        }catch(InvalidIdException e){
            System.out.println(e.getCode());
        }catch (Exception e){
            throw new RuntimeException(e);
        }try {
            biometricRecharge.login("triveni","12345");
        }catch (InvalidIdException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(" Thankyou ");
        }
    }

}