/**
 * Created by slawek on 2017-01-20.
 */
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
    @Autowired
    UserService userService;
    @Autowired
    GameService gameService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userService.getAll());
        return "index";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("newUser", new User());
        return "register";
    }

    @RequestMapping("/offer")
    public String offer(Model model) {
        model.addAttribute("games", gameService.getAll());
        return "offer";
    }

    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("users", userService.getAll());
        return "offer";
    }
    @RequestMapping("/order")
    public String order(Model model) {
        //model.addAttribute("users", userService.getAll());
        return "order";
    }


}