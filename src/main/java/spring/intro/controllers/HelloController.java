package spring.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.intro.UserResponseDto;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello123";
    }

    @GetMapping("/userDto")
    public UserResponseDto getUser() {
        UserResponseDto dto = new UserResponseDto();
        dto.setName("Bob");
        dto.setSurname("Dillan");
        return dto;
    }
}
