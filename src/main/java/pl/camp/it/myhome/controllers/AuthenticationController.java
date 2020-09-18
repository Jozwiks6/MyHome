package pl.camp.it.myhome.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.myhome.model.Admin;
import pl.camp.it.myhome.model.User;
import pl.camp.it.myhome.services.IAdminService;
import pl.camp.it.myhome.services.IUserService;

@Controller
public class AuthenticationController {

    @Autowired
    IUserService userService;

    @Autowired
    IAdminService adminService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginFormUser(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute User user){
        boolean authenticationResult = userService.authenticate(user);

        if(authenticationResult){
            return "redirect:/main";
        } else {
            return "redirect:/login";
        }
    }
                //MAPPING DO ADMINA
    @RequestMapping(value = "/loginAdmin", method = RequestMethod.GET)
    public String loginFormAdmin(Model model){
        model.addAttribute("admin", new Admin());
        return "loginAdmin";
    }

    @RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
    public String loginAdmin(@ModelAttribute Admin admin){
        boolean authenticationResult = adminService.authenticate(admin);

        if(authenticationResult){
            return "redirect:/main";
        } else {
            return "redirect:/loginAdmin";
        }
    }
}
