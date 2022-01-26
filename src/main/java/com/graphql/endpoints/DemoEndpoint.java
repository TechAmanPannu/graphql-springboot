package com.graphql.endpoints;

import com.graphql.dao.DemoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/demo")
public class DemoEndpoint {

    @Autowired
    private DemoDao demoDao;


    @GetMapping
    public ResponseEntity getMetrics()  {
       return ResponseEntity.ok(demoDao.doSomething());
    }
}
