package com.graphql_springboot.controllers;


import com.graphql_springboot.dao.DemoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/demo")
public class DemoEndpoint {

    private DemoDao demoDao;

    public DemoEndpoint(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @GetMapping(value = "/do-something")
    public ResponseEntity doSomething() {
        return ResponseEntity.ok(demoDao.doSomething());
    }

    @GetMapping(value = "/do-nothing")
    public ResponseEntity doNothing() {
        return ResponseEntity.ok(demoDao.doNothing());
    }
}
