package Service;

public interface FastTagPayment {
    double payment() throws InsufficentWalletBalance;
}
