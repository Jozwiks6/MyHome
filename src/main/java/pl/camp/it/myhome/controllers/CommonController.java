package pl.camp.it.myhome.controllers;

import org.springframework.stereotype.Controller;
import pl.camp.it.myhome.session.SessionObject;

import javax.annotation.Resource;

@Controller
public class CommonController {

    @Resource
    SessionObject sessionObject;


}
