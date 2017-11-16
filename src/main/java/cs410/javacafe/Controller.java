package cs410.javacafe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView result = new ModelAndView("home");
        customerRepository.save(new Customer("JohnDoe", "John", "Doe", "unsltdPss", "stuff"));
        result.addObject("cust", customerRepository.findByCustID("JohnDoe"));
        return result;
    }

//    @PostMapping("/")
//    public String form(Map<String, Object> model){
//        return "";
//    }

}
