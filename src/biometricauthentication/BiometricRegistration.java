package biometricauthentication;

public interface BiometricRegistration {
    String registration(String gender,int age) throws InvalidIdException;

}
