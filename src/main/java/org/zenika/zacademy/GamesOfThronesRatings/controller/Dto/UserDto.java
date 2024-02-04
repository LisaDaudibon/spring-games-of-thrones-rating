package org.zenika.zacademy.GamesOfThronesRatings.controller.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int id;
    private String name;

    public UserDto () { }
    public UserDto (int id, String name) {
        this.id = id;
        this.name = name;
    }
}
