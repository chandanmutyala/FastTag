package interfacelatest;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService{

    BankOTPValidationService sbiBankLoginService;

    public SBIBankLoginProcess(){
       this. sbiBankLoginService=new SBIBankLoginService();

    }

    public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
        this. sbiBankLoginService=sbiBankLoginService;

    }
    @Override
    public boolean login(String userName, String passWord) {
        if(sbiBankLoginService.login(userName, passWord)){
            String otp=sbiBankLoginService.generateOTP(userName);
            boolean validOtp= false;
            try {
               // validOtp = sbiBankLoginService.validateOTP(UUID.randomUUID().toString());
                validOtp = sbiBankLoginService.validateOTP(otp);
            } catch (InvalidOTPException invalidOTPException) {
                System.out.println(" Error Occurred "+invalidOTPException);
                throw new InvalidRunTimeException(invalidOTPException.getCode(),invalidOTPException.getMessage());
            }catch (Exception e){

            }
            if(validOtp){
                System.out.println("valid OTP and Login successfully");
            }else{
                System.out.println("invalid OTP and login Failed");
            }
            return validOtp;
        }else{
            System.out.println("invalid credentials");
            return false;
        }

    }
}
