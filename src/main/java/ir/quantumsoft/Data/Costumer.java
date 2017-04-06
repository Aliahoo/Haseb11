package ir.quantumsoft.Data;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by AliSalehi on 22/03/2017.
 */
@Entity
@Table(name = "costumers")
public class Costumer {
    public Costumer(String costumerName, String phoneNumber, String mobileNumber, Date registerDate) {
        this.costumerName = costumerName;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.registerDate = registerDate;
    }

    private Long id;
    private String costumerName ;
    private String phoneNumber ;
    private String mobileNumber;
    private Date registerDate ;

    private Set<Factor> factors;
    private Set<Check> checks;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "check_id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "costumer_name")
    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Column(name = "mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    @Column(name = "register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "costumer")
    public Set<Factor> getFactors() {
        return factors;
    }

    public void setFactors(Set<Factor> factors) {
        this.factors = factors;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "costumer")
    public Set<Check> getChecks() {
        return checks;
    }

    public void setChecks(Set<Check> checks) {
        this.checks = checks;
    }
}
