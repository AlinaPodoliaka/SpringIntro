package spring.intro.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.intro.UserResponseDto;
import spring.intro.model.User;
import spring.intro.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/inject")
    private String injectUsers() {
        User user1 = new User();
        user1.setName("Martin");
        user1.setSurname("Fourcade");
        User user2 = new User();
        user2.setName("Simon");
        user2.setSurname("Fourcade");
        User user3 = new User();
        user3.setName("Tarij");
        user3.setSurname("Boe");
        User user4 = new User();
        user4.setName("Johannes");
        user4.setSurname("Boe");
        userService.add(user1);
        userService.add(user2);
        userService.add(user3);
        userService.add(user4);
        return "Success";
    }

    @GetMapping(value = "/{id}")
    private UserResponseDto getUser(@PathVariable Long id) {
        UserResponseDto userResponseDto = new UserResponseDto(userService.getById(id));
        return userResponseDto;
    }

    @GetMapping(value = "/")
    private List<UserResponseDto> getUsers() {
        List<UserResponseDto> userResponseDtoList = new ArrayList<>();
        userService.listUsers().forEach(user -> userResponseDtoList.add(new UserResponseDto(user)));
        return userResponseDtoList;
    }
}
