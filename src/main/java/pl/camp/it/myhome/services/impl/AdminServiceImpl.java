package pl.camp.it.myhome.services.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.myhome.dao.IAdminDAO;
import pl.camp.it.myhome.model.Admin;
import pl.camp.it.myhome.services.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    IAdminDAO adminDAO;

    @Override
    public boolean authenticate(Admin admin) {
        Admin adminFromDatabase = adminDAO.getAdminByLogin(admin.getLogin());

        if(adminFromDatabase == null) {
            return false;
        }
        if (DigestUtils.md5Hex(admin.getPassword()).equals(adminFromDatabase.getPassword())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDAO.addAdmin(admin);
    }
}
