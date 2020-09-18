package pl.camp.it.myhome.dao;

import pl.camp.it.myhome.model.User;

public interface IUserDAO {
    User getUserByLogin(String login);
    void addUser(User user);
}
