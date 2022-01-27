package com.graphql_springboot.impl;

import com.graphql_springboot.dao.DemoDao;
import org.springframework.stereotype.Service;


@Service
public class DemoDaoImpl implements DemoDao {


    @Override
    public String doSomething() {
        return "something returned";
    }

    @Override
    public String doNothing() {
        return "nothing returned";
    }
}
