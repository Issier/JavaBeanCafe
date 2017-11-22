package cs410.javacafe.POJO;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class MenuItem implements Serializable{
    private Long itemId;
    private String itemName;
    private String itemType;
    private double itemCost;
    private String healthFacts;
    private List<Vote> votes;


    protected MenuItem(){}

    public MenuItem(String itemName, String itemType, double itemCost, String healthFacts) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemCost = itemCost;
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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
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
                ", healthFacts='" + healthFacts + '\'' +
                '}';
    }
}
