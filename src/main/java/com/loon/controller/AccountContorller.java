package com.loon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class AccountContorller {

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getFruit(@PathVariable String fruitName, ModelMap model) {

//        Fruit fruit = new Fruit(fruitName, 1000);
//        domain.addAttribute("domain", fruit);

        return "list";

    }
}
