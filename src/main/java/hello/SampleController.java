/**
 * Created by slawek on 2017-01-20.
 */
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {
    @Autowired
    UserService userService;
    @Autowired
    GameService gameService;
    @Autowired
    Cart cart;

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
        model.addAttribute("cart", cart);
        return "offer";
    }

    @RequestMapping("/cart")
    public String cart(Model model) {
        List<Game> gameList = cart.getGameList();
        double sum = 0;
        for (Game g: gameList) {
            sum += g.getPrice();
        }
        model.addAttribute("cart", cart);
        model.addAttribute("sum", sum);
        return "cart";
    }
    @RequestMapping("/order")
    public String order(Model model) {
        List<User> userList = userService.getAll();
        User user = userList.get(userList.size()-1);
        model.addAttribute("newOrder", new GameOrder(user));
        return "order";
    }

    @RequestMapping(value = "/register/post", method = RequestMethod.POST)
    public String registerPost(@ModelAttribute User newUser, Model model) {
        model.addAttribute("newUser", newUser);
        User user = userService.createUser(newUser);
        if (user != null) {
            return "confirmation";
        }
        else {
            return "redirect:/register?fail";
        }
    }

    @RequestMapping(value = "/order/post", method = RequestMethod.POST)
    public String orderPost(Model model) {
        List<Game> gameList = cart.getGameList();
        double sum = 0;
        for (Game g: gameList) {
            sum += g.getPrice();
        }
        model.addAttribute("sum", sum);

        return "orderConf";
    }


}