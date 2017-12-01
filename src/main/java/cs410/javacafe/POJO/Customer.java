package cs410.javacafe.POJO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name="customer")
@Table(name = "customer")
public class Customer implements Serializable{
    private Long id;
    private String custId;
    private String custPswd;
    private List<Vote> votes;

    protected Customer(){
    }

    public Customer(String custId, String custPswd) {
        this.custId = custId;
        this.custPswd = custPswd;
    }

    public String getCustPswd() {
        return custPswd;
    }

    public void setCustPswd(String custPswd) {
        this.custPswd = custPswd;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="cust_id")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @OneToMany(mappedBy = "voteCust", cascade = CascadeType.ALL)
    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custId + '\'' +
                ", custPswd='" + custPswd + '\'' +
                '}';
    }
}
