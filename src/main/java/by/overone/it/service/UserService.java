package by.overone.it.service;

import by.overone.it.pojo.User;
import by.overone.it.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        return userRepository.getUserByUsernameAndPassword(username, password);
    }

    private void saveUser(User user) {
        userRepository.save(user);
    }

    public void saveUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        saveUser(user);
    }
}
