package com.accolite.wmt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accolite.wmt.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {

    private static Logger LOGGER = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public void testUser(HttpServletRequest request, HttpServletResponse response) {

        LOGGER.info("Service is working fine");
        LOGGER.info("User Service create user output: " + userService.createUser());
    }

}
