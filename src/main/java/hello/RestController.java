/**
 * Created by slawek on 2017-01-20.
 */
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestController {
    @Autowired
    UserService userService;
    @Autowired
    Cart cart;

    @RequestMapping(value = "/api/addToCart", method = RequestMethod.POST)
    @ResponseBody public Game addToCart(@RequestBody Game game, Model model) {
        cart.addToCart(game);
        return game;
    }

    @RequestMapping(value = "/api/removeFromCart", method = RequestMethod.GET)
    @ResponseBody public int removeFromCart(@RequestParam int ind, Model model) {
        cart.removeFromCart(ind);
        return ind;
    }

    @RequestMapping(value = "/api/removeAllFromCart", method = RequestMethod.GET)
    @ResponseBody public boolean removeAllFromCart(Model model) {
        cart.clearCart();
        return true;
    }
}