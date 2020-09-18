package pl.camp.it.myhome.services;

import pl.camp.it.myhome.model.Admin;

public interface IAdminService {
    boolean authenticate (Admin admin);
    void addAdmin(Admin admin);

}
