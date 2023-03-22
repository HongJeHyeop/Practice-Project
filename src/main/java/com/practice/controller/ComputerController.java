package com.practice.controller;

import com.practice.mapper.ComputerMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/com")
public class ComputerController {
    @Autowired
    private ComputerMapper computerMapper;

    @GetMapping
    public void get_all_computer(Model model) {
        model.addAttribute("computers", computerMapper.get_all_computer());
        log.info("==========get_all_computer========");
    }

    @GetMapping("/{serialNumber}")
    public String get_computer_by_serialName(@PathVariable String serialNumber, Model model) {
        model.addAttribute("vo", computerMapper.get_computer_by_serialName(serialNumber));
        return "/com/serial";
    }

    @GetMapping("/ram")
    public void get_computer_by_ram(@RequestParam String key, Model model) {
        model.addAttribute("vos", computerMapper.get_computer_by_ram(key));
        log.info("get_computer_by_ram>>>>>>>>>>>>>>>>>>>>>>" + key);
        log.info("model >>>>>>>>>" + computerMapper.get_computer_by_ram(key));
    }


}
