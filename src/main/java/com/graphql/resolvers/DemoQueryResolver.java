package com.graphql.resolvers;

import com.graphql.dao.DemoDao;
import com.graphql.impl.DemoDaoImpl;
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
