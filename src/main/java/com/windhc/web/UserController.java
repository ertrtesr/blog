package com.windhc.web;

import com.windhc.domain.User;
import com.windhc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HC on 2016/6/17.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(method = RequestMethod.GET, value = "/test")
  public User test() {
    return userService.getOne(1);
  }

}