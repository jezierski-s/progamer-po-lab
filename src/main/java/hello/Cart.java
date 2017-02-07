package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by slawek on 2017-02-06.
 */
@Component
@Scope("singleton")
public class Cart {

    private List<Game> gameList = new ArrayList();

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public void addToCart(Game game) {
        gameList.add(game);
    }

    public void removeFromCart(int ind) {gameList.remove(ind);}

    public void clearCart() {
        this.gameList = new ArrayList();
    }
}
