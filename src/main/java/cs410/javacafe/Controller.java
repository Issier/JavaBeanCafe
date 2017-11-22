package cs410.javacafe;

import cs410.javacafe.DAO.CustomerRepository;
import cs410.javacafe.DAO.MenuItemRepository;
import cs410.javacafe.DAO.VoteRepository;
import cs410.javacafe.POJO.Customer;
import cs410.javacafe.POJO.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    MenuItemRepository menuItemRepository;
    @Autowired
    VoteRepository voteRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public ModelAndView home(){
        return getHomeView();
    }

    @PostMapping("/")
    public ModelAndView processVote(@RequestParam("voteItems")long checked){
        voteRepository.save(new Vote(
                customerRepository.findOne("james24"),
                menuItemRepository.findOne(checked)));
        return getHomeView();
    }

    private ModelAndView getHomeView(){
        ModelAndView homeView = new ModelAndView("home");
        homeView.addObject("menu", menuItemRepository.findAll());
        homeView.addObject("voteOption", menuItemRepository.findMenuItemByItemType("Beverage"));
        return homeView;
    }

}
