package com.graphql.resolvers;

import com.graphql.dao.DemoDao;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class DemoQueryResolver implements GraphQLQueryResolver {

    private DemoDao demoDao;

    public DemoQueryResolver(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    String doSomething() { return demoDao.doSomething(); }
}
