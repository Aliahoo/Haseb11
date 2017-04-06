package ir.quantumsoft.Data;
import javax.persistence.*;
import java.util.*;
/**
 * Created by AliSalehi on 22/03/2017.
 */
@Entity
@Table(name="roles")
public class Role {


    private Long id;
    private String name;
    private Set<User> userRoles;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<User> userRoles) {
        this.userRoles = userRoles;
    }

}