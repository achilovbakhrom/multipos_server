package com.steps.basic.controllers;


import com.steps.basic.db.entities.UserInfo;
import com.steps.basic.db.repositories.UserRepository;
import com.steps.basic.helpers.Roles;
import com.steps.basic.helpers.from_client.CUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Controller
public class DatabaseController {
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody boolean create(@RequestBody CUser cUser) {
        System.out.println("trying to connection"+"\n"+cUser.getUsername()+"\n"+cUser.getPassword()+"\n"+" null? "+(cUser == null));
        List<SimpleGrantedAuthority> authList = new ArrayList<SimpleGrantedAuthority>();
        authList.add(new SimpleGrantedAuthority(Roles.BASE_ROLE.toString()));
        UserInfo user = new UserInfo(cUser.getUsername(), cUser.getPassword(), authList);
        user.seteMail(cUser.geteMail());
        user.setMode(cUser.getMode());
        user.generateUid();
        user.setFcmToken("fcm_token");
        try {
            userRepository.save(user);
        }
        catch (Exception ex) {
            return false;
        }
        return true;
    }
    @RequestMapping(value = "/who_i_am", method = RequestMethod.POST)
    public @ResponseBody String whoIAm() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = user.getUsername();
        UserInfo userInfo = userRepository.findUserByUsername(username);
        String mode = userInfo.getMode();
        return mode;
    }
    @Autowired
    private UserRepository userRepository;
}
