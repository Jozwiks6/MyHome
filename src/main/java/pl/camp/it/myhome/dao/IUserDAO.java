package pl.camp.it.myhome.dao;

import pl.camp.it.myhome.model.User;

import javax.jws.soap.SOAPBinding;

public interface IUserDAO {

    User getUserByLogin(String login);
    void addUser(User user);
}
