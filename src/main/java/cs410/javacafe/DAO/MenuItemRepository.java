package cs410.javacafe.DAO;

import cs410.javacafe.POJO.MenuItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long>{
    List<MenuItem> findMenuItemByItemName(String itemName);
}
