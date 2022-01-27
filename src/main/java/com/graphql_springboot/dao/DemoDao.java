package com.graphql_springboot.dao;


import org.springframework.stereotype.Service;


@Service
public interface DemoDao {

    String doSomething();

    String doNothing();
}
