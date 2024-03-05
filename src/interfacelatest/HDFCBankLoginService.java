package interfacelatest;

public class HDFCBankLoginService implements BankLoginService{
    String accountNumber="2222";
    String passWord="1234";
    String otp;
    public HDFCBankLoginService(){

    }


    @Override
    public boolean login(String userName, String passWord) {
        if(userName.equals(accountNumber)&&this.passWord.equals(passWord)){
            return true;
        }
        return false;
    }

}
