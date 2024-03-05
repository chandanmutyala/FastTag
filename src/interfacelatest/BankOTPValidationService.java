package interfacelatest;

public interface BankOTPValidationService extends BankLoginService{
    String generateOTP(String accountNumber);    //abstract method
    boolean validateOTP(String otp) throws Exception;                //abstract method

}
