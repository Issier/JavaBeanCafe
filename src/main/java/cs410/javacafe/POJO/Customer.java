package cs410.javacafe.POJO;

import javax.persistence.*;

@Entity(name="Customer")
public class Customer {
    private String custID;
    private String firstName;
    private String lastName;
    private String custPswd;
    private String pswdSalt;

    protected Customer(){
    }

    public Customer(String custID, String firstName, String lastName, String custPswd, String pswdSalt) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.custPswd = custPswd;
        this.pswdSalt = pswdSalt;
    }

    public String getCustPswd() {
        return custPswd;
    }

    public void setCustPswd(String custPswd) {
        this.custPswd = custPswd;
    }

    public String getPswdSalt() {
        return pswdSalt;
    }

    public void setPswdSalt(String pswdSalt) {
        this.pswdSalt = pswdSalt;
    }

    @Id
    public String getCustID(){
        return custID;
    }

    public void setCustID(String custID){ this.custID = custID;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", custPswd='" + custPswd + '\'' +
                ", pswdSalt='" + pswdSalt + '\'' +
                '}';
    }
}
