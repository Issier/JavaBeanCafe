package cs410.javacafe.POJO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Vote{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int voteSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voteCust")
    private Customer voteCust;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voteBevr")
    private MenuItem voteBevr;

    protected Vote(){
    }

    public Vote(Customer voteCust, MenuItem voteBevr) {
        this.voteCust = voteCust;
        this.voteBevr = voteBevr;
    }

    public int getSeq() {
        return voteSeq;
    }

    public void setSeq(int seq) {
        this.voteSeq = seq;
    }

    public Customer getVoteCust() {
        return voteCust;
    }

    public void setVoteCust(Customer voteCust) {
        this.voteCust = voteCust;
    }

    public MenuItem getVoteBevr() {
        return voteBevr;
    }

    public void setVoteBevr(MenuItem voteBevr) {
        this.voteBevr = voteBevr;
    }
}
