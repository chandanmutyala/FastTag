package fastTagVersion2;

import fastTagVersion2.model.InsufficentWalletBalance;

public interface FstTagPayment {
    double payment() throws InsufficentWalletBalance;
}
