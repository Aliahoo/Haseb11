package ir.quantumsoft.Data;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by AliSalehi on 22/03/2017.
 */
@Entity
@Table(name = "checks")
public class Check {
    private Long id ;
    private Date passDate ;
    private Date registerDate;

    private Factor factor;
    private Costumer costumer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "check_id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "pass_date")
    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }
    @Column(name = "register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factor_id", nullable = false)
    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costumer_id", nullable = false)
    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }
}
