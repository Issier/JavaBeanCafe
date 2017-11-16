package cs410.javacafe.POJO;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemID;
    private String itemName;
    private double itemCost;
    private Long itemQty;
    private String healthFacts;

    protected MenuItem(){}

    public MenuItem(String itemName, double itemCost, Long itemQty, String healthFacts) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.itemQty = itemQty;
        this.healthFacts = healthFacts;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
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

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemCost=" + itemCost +
                ", itemQty=" + itemQty +
                ", healthFacts='" + healthFacts + '\'' +
                '}';
    }
}
