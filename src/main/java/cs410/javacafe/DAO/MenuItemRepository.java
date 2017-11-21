package cs410.javacafe.DAO;

import cs410.javacafe.POJO.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findMenuItemByItemName(String itemName);
}
