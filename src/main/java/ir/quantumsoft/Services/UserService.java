package ir.quantumsoft.Services;

import ir.quantumsoft.Data.User;

/**
 * Created by AliSalehi on 29/03/2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}