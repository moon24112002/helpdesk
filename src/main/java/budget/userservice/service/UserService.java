package budget.userservice.service;

import budget.userservice.entity.User;
import budget.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.management.ConstructorParameters;
import java.util.List;


@Service
public class UserService implements IUserService{

    private final UserRepository _userRepository;

    public UserService(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
       return _userRepository.save(user);
    }

    @Override
    public User deleUser(String id) {
        return null;
    }

    @Override
    public User findUser(String id) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return _userRepository.findAll();
    }
}
