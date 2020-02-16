package spring.intro;

import spring.intro.model.User;

public class UserResponseDto {
    private String name;
    private String surname;

    public UserResponseDto(User user) {
        name = user.getName();
        surname = user.getSurname();
    }

    public UserResponseDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

