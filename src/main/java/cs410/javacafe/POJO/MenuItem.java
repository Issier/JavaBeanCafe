package cs410.javacafe.POJO;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class MenuItem implements Serializable{
    private Long itemId;
    private String itemName;
    private double itemCost;
    private Long itemQty;
    private String healthFacts;
    private List<Vote> votes;


    protected MenuItem(){}

    public MenuItem(String itemName, double itemCost, Long itemQty, String healthFacts) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.itemQty = itemQty;
        this.healthFacts = healthFacts;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public Long getItemQty() {
        return itemQty;
    }

    public void setItemQty(Long itemQty) {
        this.itemQty = itemQty;
    }

    public String getHealthFacts() {
        return healthFacts;
    }

    public void setHealthFacts(String healthFacts) {
        this.healthFacts = healthFacts;
    }

    @OneToMany(mappedBy = "voteBevr", cascade = CascadeType.ALL)
    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemID=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemCost=" + itemCost +
                ", itemQty=" + itemQty +
                ", healthFacts='" + healthFacts + '\'' +
                '}';
    }
}
