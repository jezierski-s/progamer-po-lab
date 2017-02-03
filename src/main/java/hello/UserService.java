package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by slawek on 2017-02-03.
 */
@Service
public class UserService {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserRepository userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User createUser(User newUser) {
        if (!(loginExists(newUser) || mailExists(newUser))) {
            newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
            userRepo.save(newUser);
            return userRepo.getOne(newUser.getId());
        }
        else {
            return null;
        }
    }

    public boolean loginExists(User user) {
        List<User> userList = userRepo.findAll();
        for (User u : userList) {
            if (u.getLogin().equals(user.getLogin())) {
                return true;
            }
        }
        return false;
    }

    public boolean mailExists(User user) {
        List<User> userList = userRepo.findAll();
        for (User u : userList) {
            if (u.getMail().equals(user.getMail())) {
                return true;
            }
        }
        return false;
    }
}
