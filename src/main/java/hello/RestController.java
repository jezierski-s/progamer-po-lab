/**
 * Created by slawek on 2017-01-20.
 */
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register/post", method = RequestMethod.POST)
    public String registerPost(@ModelAttribute User newUser, Model model) {
        model.addAttribute("newUser", newUser);
        User user = userService.createUser(newUser);
        if (user != null) {
            return "redirect:/";
        }
        else {
            return "redirect:/register?fail";
        }
    }

    @RequestMapping(value = "/api/addToCart", method = RequestMethod.POST)
    public String addToCart(Model model) {
            return "redirect:/";
    }
}