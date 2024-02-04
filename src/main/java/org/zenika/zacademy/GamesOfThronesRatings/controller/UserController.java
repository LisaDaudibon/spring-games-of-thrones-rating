package org.zenika.zacademy.GamesOfThronesRatings.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zenika.zacademy.GamesOfThronesRatings.controller.Dto.UserDto;
import org.zenika.zacademy.GamesOfThronesRatings.controller.Dto.UserMapper;
import org.zenika.zacademy.GamesOfThronesRatings.service.UserService;
import org.zenika.zacademy.GamesOfThronesRatings.service.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserService userService;
    private UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List <UserDto> getAll () {
        List<User> users = this.userService.getAll();
        return users.stream().map(user -> userMapper.getUserToUserDto(user)).toList();
    }

}
