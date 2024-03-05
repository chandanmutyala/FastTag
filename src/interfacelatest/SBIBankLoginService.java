package interfacelatest;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationService{
    String accountNumber="11111";
    String passWord="1234";
    String otp;
    Date otpExpireTime;
    public SBIBankLoginService(){

    }


    @Override
    public boolean login(String userName, String passWord) {
        if(userName.equals(accountNumber)&&this.passWord.equals(passWord)){
            return true;
        }
        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)){
             otp= UUID.randomUUID().toString();
            Calendar otpExpiryCalendar=Calendar.getInstance();
            otpExpiryCalendar.add(Calendar.SECOND,60);
            System.out.println(" otpExpiryCalendar "+otpExpiryCalendar.getTime());
            otpExpireTime=otpExpiryCalendar.getTime();
            return otp;
        }
        return null;
    }

    @Override
    public boolean validateOTP(String otp)  throws InvalidOTPException {
        if(this.otp.equals(otp)){

            return true;
        }else {
            System.out.println("Invalid OTP");
            throw new InvalidOTPException(ErrorCodes.NEOTERIC_INVALID_OTP_1000.getCode(),
                    ErrorCodes.NEOTERIC_INVALID_OTP_1000.getMessage());
        }

    }
}
