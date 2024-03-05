package interfacelatest;

public class SBILoginTest {
    public static void main(String[] args) {
      BankLoginService loginService=new SBIBankLoginProcess();
     try {

         boolean loginStatus = loginService.login("11111", "1234");
         if (loginStatus) {
             System.out.println("login successfully");
         } else {
             System.out.println("login failed");
         }
     }catch (InvalidRunTimeException e){
         System.out.println(e.getCode()+"   "+e.getMessage());
     }

    }
}
