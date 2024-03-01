package biometricauthentication;

public abstract class BiometricService implements BiometricRegistration,BiometricLogin{
    BiometricUserDetails biometricUserDetails;

    abstract String recharge(String userId,int amount);

    public BiometricService(){

        this.biometricUserDetails=new BiometricUserDetails();
    }

    public String registration(String gender,int age) throws InvalidIdException {
        if (gender.equals(biometricUserDetails.getGender())) {
            System.out.println("Registration successfully");
            return "biometricdetails";

        } else {

            throw new InvalidIdException(ErrorCode.BIOMETRIC_VALID_1001.getCode(),
                    ErrorCode.BIOMETRIC_VALID_1001.getMessage());
           // System.out.println("InvalidCredentials" + biometricUserDetails.getGender());
        }



    }
    public String login(String userName,String password)throws InvalidIdException{
        if (password.equals(biometricUserDetails.getPassword())){
            System.out.println("Registration Success");
        }else {
            throw new InvalidIdException(ErrorCode.BIOMETRIC_INVALID_1002.getCode(),
                    ErrorCode.BIOMETRIC_INVALID_1002.getMessage());
           // System.out.println("InvalidLoginDetails"+biometricUserDetails.getPassword());

        }
        return "biometricuserdetails";

    }



}


