package ir.quantumsoft.Data;

import javax.persistence.*;
/**
 * Created by AliSalehi on 22/03/2017.
 */
@Entity
@Table(name = "factors")
public class Factor {
    private Long id ;
    private String description;
    private double cost;
    private double discount;
    private double finalCost;

    private Costumer costumer;
    private Check check;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "factor_id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "cost")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    @Column(name = "discount")
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    @Column(name = "final_cost")
    public double getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costumer_id", nullable = false)
    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "check_id")
    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }
}
