package ir.quantumsoft.Repositories;

import ir.quantumsoft.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by AliSalehi on 28/03/2017.
 */

public interface UserRepository extends JpaRepository<User , Long> {
    User findByUsername(String username);
}
