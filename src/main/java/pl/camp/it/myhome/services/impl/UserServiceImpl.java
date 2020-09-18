package pl.camp.it.myhome.services.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.myhome.dao.IUserDAO;
import pl.camp.it.myhome.model.User;
import pl.camp.it.myhome.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDAO userDao;

    @Override
    public boolean authenticate(User user) {
        User userFromDatabase = userDao.getUserByLogin(user.getLogin());

        if(userFromDatabase == null){
            return false;
        }
        if(DigestUtils.md5Hex(user.getPassword()).equals(userFromDatabase.getPassword())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public boolean registerUser(User user, String repeatedPassword) {
        if(!user.getPassword().equals(repeatedPassword)){
            return false;
        }
        this.userDao.addUser(user);
        return true;
    }
}
