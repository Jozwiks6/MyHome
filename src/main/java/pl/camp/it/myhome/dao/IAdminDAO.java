package pl.camp.it.myhome.dao;

import pl.camp.it.myhome.model.Admin;

public interface IAdminDAO {
    Admin getAdminByLogin(String login);

    void addAdmin(Admin admin);
}
