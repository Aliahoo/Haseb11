package ir.quantumsoft.Services;

/**
 * Created by AliSalehi on 29/03/2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}