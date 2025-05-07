package budget.userservice.controller;

import budget.userservice.entity.User;
import budget.userservice.service.IUserService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService _userService;

    public UserController(IUserService userService) {
        _userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return _userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return _userService.findAllUser();
    }
}
