package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by slawek on 2017-02-03.
 */
@Service
public class GameService {

    @Autowired
    GameRepository gameRepo;

    public List<Game> getAll() {
        return gameRepo.findAll();
    }

}
