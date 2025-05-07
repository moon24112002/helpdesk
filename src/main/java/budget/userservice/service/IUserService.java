package budget.userservice.service;

import budget.userservice.entity.User;
import java.util.*;

public interface IUserService {
    User createUser(User user);
    User deleUser(String id);
    User findUser(String id);
    List<User> findAllUser();
}
