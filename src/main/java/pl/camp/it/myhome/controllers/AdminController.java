package pl.camp.it.myhome.controllers;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.myhome.model.User;
import pl.camp.it.myhome.services.IAdminService;
import pl.camp.it.myhome.services.IUserService;

@Controller
@RequestMapping(value = "/admin/utils")
public class AdminController {

    @Autowired
    IAdminService adminService;

    @Autowired
    IUserService userService;

    /*@RequestMapping(value = "/addAdmin", method = RequestMethod.GET)
    public String addAdmin(){
        Admin admin = new Admin();
        admin.setLogin("admin");
        String hashedAdminPassword = DigestUtils.md5Hex("admin");
        admin.setPassword(hashedAdminPassword);

        adminService.addAdmin(admin);
        return "redirect:/login";
    }*/

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(){
        User user = new User();
        user.setLogin("admin");
        String hashedAdminPassword = DigestUtils.md5Hex("admin");
        user.setPassword(hashedAdminPassword);

        userService.addUser(user);
        return "redirect:/login";
    }
}
