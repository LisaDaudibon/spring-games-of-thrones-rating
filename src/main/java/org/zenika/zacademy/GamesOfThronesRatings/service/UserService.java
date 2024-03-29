package org.zenika.zacademy.GamesOfThronesRatings.service;

import org.springframework.stereotype.Service;
import org.zenika.zacademy.GamesOfThronesRatings.service.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public UserService (List<User> users ) { this.users = users; }

    private int getNextId() {
        final int nextId;
        if (users.isEmpty()) {
            nextId = 1;
        } else {
            nextId = Collections.max(users.stream() .map(User::getId).toList()) + 1;
        }
        return nextId;
    }

    public List<User> getAll () {
        return this.users;
    }

    public User getOneById(int searchedId ) {
        for (User user : users) {
            if (user.getId() == searchedId) {
                return user;
            }
        }
        return null;
    }

    public User add ( User newUser ) {
        int nextId = this.getNextId();

        newUser.setId(nextId);

        users.add(newUser);
        return newUser;
    }

    public void deleteById(int searchedId) {
        users.removeIf(user -> user.getId() == searchedId);
    }

    public User updateById(int searchedId, User updatedUser ) {
        User userFound = getOneById(searchedId);

        userFound.setName(updatedUser.getName());

        return userFound;
    }
}
