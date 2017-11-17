package cs410.javacafe.DAO;

import cs410.javacafe.POJO.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
    List<Orders> findByOrdDate(String ordDate);
}
