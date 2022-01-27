package com.graphql_springboot.graphql.query;

import com.graphql_springboot.dao.DemoDao;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class DemoQueryResolver implements GraphQLQueryResolver {

    private DemoDao demoDao ;

    public DemoQueryResolver(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    public String doSomething() {
        return demoDao.doSomething();
    }

    public String doNothing() {
        return demoDao.doNothing();
    }
}
