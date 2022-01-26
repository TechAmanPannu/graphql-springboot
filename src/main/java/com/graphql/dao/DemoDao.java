package com.graphql.dao;


import org.springframework.stereotype.Service;


@Service
public interface DemoDao {

    String doSomething();

    String doNothing();
}
