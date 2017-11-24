package cs410.javacafe.POJO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name="customer")
@Table(name = "customer")
public class Customer implements Serializable{
    private String custId;
    private String custFname;
    private String custLname;
    private String custPswd;
    private List<Vote> votes;

    protected Customer(){
    }

    public Customer(String custId, String firstName, String lastName, String custPswd) {
        this.custId = custId;
        this.custFname = firstName;
        this.custLname = lastName;
        this.custPswd = custPswd;
    }

    public String getCustPswd() {
        return custPswd;
    }

    public void setCustPswd(String custPswd) {
        this.custPswd = custPswd;
    }

    @Id
    @Column(name="cust_id")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustFname() {
        return custFname;
    }

    public void setCustFname(String custFname) {
        this.custFname = custFname;
    }

    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname;
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
                ", firstName='" + custFname + '\'' +
                ", lastName='" + custLname + '\'' +
                ", custPswd='" + custPswd + '\'' +
                '}';
    }
}
