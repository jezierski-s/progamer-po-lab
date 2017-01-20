/**
 * Created by slawek on 2017-01-20.
 */
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
    @Autowired
    UserRepository userRepo;
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }
}