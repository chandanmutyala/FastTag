package biometricauthentication;

public interface BiometricLogin {
    String login(String userName,String password) throws InvalidIdException;
}
