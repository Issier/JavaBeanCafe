package cs410.javacafe;

import cs410.javacafe.DAO.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    MenuItemRepository menuItemRepository;

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView result = new ModelAndView("home");
        result.addObject("menu", menuItemRepository.findAll());
        return result;
    }

}
