package pl.camp.it.myhome.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.camp.it.myhome.dao.IUserDAO;
import pl.camp.it.myhome.model.User;
import pl.camp.it.myhome.services.IUserService;

public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDAO userDAO;

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
