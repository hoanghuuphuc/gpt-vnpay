package com.pts.Controller.site;

import com.pts.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dangKyController {
    @RequestMapping("auth/signup")
    public String signup(Model m, Account account){
//        m.addAttribute("acc",account);
        return "site/dangky";
    }
}
