package com.practice.controller;

import com.practice.domain.ComputerVO;
import com.practice.mapper.ComputerMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api")
public class ComputerAPIController {

    @Autowired
    private ComputerMapper computerMapper;

    @GetMapping
    public List<ComputerVO> get_all_computer() {
        log.info("==========get_all_computer========");
        return computerMapper.get_all_computer();
    }

    @GetMapping("/{serialNumber}")
    public ComputerVO get_computer_by_serialName(@PathVariable String serialNumber) {
        return computerMapper.get_computer_by_serialName(serialNumber);

    }

    @GetMapping("/ram")
    public List<ComputerVO> get_computer_by_ram(@RequestParam String key) {
        return computerMapper.get_computer_by_ram(key);
    }

}
