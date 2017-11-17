package cs410.javacafe.POJO;

import javax.persistence.*;

@Entity
public class Orders {
    private long ordNum;
    private Customer ordCust;
    private String ordDate;

    protected Orders(){}

    public Orders(long ordNum, Customer ordCust, String ordDate) {
        this.ordNum = ordNum;
        this.ordCust = ordCust;
        this.ordDate = ordDate;
    }

    @Id
    public long getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(long ordNum) {
        this.ordNum = ordNum;
    }

    @ManyToOne
    @JoinColumn(name="ord_cust", referencedColumnName = "cust_id")
    public Customer getOrdCust() {
        return ordCust;
    }

    public void setOrdCust(Customer ordCust) {
        this.ordCust = ordCust;
    }

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }
}
