package hello;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by slawek on 2017-02-06.
 */
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ElementCollection
    private List<Game> gameList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public void addToGameList(Game game) {
        this.gameList.add(game);
    }
}
