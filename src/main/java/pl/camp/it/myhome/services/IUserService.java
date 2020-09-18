package pl.camp.it.myhome.services;

import pl.camp.it.myhome.model.User;

public interface IUserService {
    boolean authenticate(User user);
    void addUser (User user);
    boolean registerUser(User user, String repeatedPassword);
}
