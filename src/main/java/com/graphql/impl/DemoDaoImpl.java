package com.graphql.impl;

import com.graphql.dao.DemoDao;
import org.springframework.stereotype.Service;


@Service
public class DemoDaoImpl implements DemoDao {


    @Override
    public String doSomething() {
        return "something returned";
    }
}
