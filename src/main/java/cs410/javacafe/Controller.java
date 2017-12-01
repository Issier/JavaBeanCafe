package cs410.javacafe;

import cs410.javacafe.DAO.CustomerRepository;
import cs410.javacafe.DAO.MenuItemRepository;
import cs410.javacafe.DAO.VoteRepository;
import cs410.javacafe.POJO.Customer;
import cs410.javacafe.POJO.Vote;
import cs410.javacafe.Processing.PassHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @Autowired
    JavaMailSender emailSender;

    @RequestMapping("/")
    public ModelAndView home(){
        return getHomeView();
    }

    @PostMapping("/vote")
    public String processVote(@RequestParam("voteItems")long checked){
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String sendToLogin(){
        return "login";
    }

    @PostMapping("/register")
    public String processRegistration(@RequestParam("username") String name,
                                            @RequestParam("passwd") String unhashedPass,
                                            @RequestParam("renterpass") String renteredPass){
        //TODO Validation Code Here
        if(customerRepository.findOne(name) == null){
            Customer newCustomer = new Customer(name, "John", "Doe", unhashedPass);
            PassHash hash = new PassHash(unhashedPass);
            newCustomer.setCustPswd(hash.getHashedPass());
            customerRepository.save(newCustomer);
        }
        return "redirect:/";
    }

    @PostMapping("/contact")
    public String contactUs(@RequestParam("subject") String subject,
                            @RequestParam("message") String body){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("javaspringcafe@gmail.com");
        message.setSubject(subject);
        message.setText("Username: " + userName + " | Message:" + body);
        emailSender.send(message);
        return "redirect:/";
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    private ModelAndView getHomeView(){
        ModelAndView homeView = new ModelAndView("home");
        homeView.addObject("menu", menuItemRepository.findAll());
        homeView.addObject("voteOption", menuItemRepository.findMenuItemByItemType("Beverage"));
        return homeView;
    }

}
