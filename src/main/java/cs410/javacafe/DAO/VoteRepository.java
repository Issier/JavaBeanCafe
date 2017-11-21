package cs410.javacafe.DAO;

import cs410.javacafe.POJO.Customer;
import cs410.javacafe.POJO.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Customer>{
    public List<Vote> getByVoteCust(Customer customer);
}
