package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.User;
import technicalblog.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(User user) {
        User exisitingUser = userRepository.checkUser(user.getUsername(), user.getPassword());
        if(exisitingUser != null) {
            return  exisitingUser;
        }
        return null;
    }

    public void registerUser(User user) {
        userRepository.registerUser(user);
    }
}

/*
package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.User;

@Service
public class UserService {

    public boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }
}
*/
