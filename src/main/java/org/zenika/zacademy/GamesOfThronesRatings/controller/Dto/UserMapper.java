package org.zenika.zacademy.GamesOfThronesRatings.controller.Dto;

import org.springframework.stereotype.Component;
import org.zenika.zacademy.GamesOfThronesRatings.service.model.User;

@Component
public class UserMapper {
    public User getUserDtoToUser ( UserDto from ) {
        return new User(from.getId(), from.getName());
    }

    public UserDto getUserToUserDto ( User from ) {
        return new UserDto(from.getId(), from.getName());
    }
}
