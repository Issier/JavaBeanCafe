package cs410.javacafe.DAO;

import cs410.javacafe.POJO.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {
    List<Customer> findByCustID(String userId);
}
