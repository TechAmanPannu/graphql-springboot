package com.graphql_springboot.endpoints;

import com.graphql_springboot.dao.DemoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Slf4j
@Component
@Path("/v1/demo")
public class DemoEndpoint {

    @Autowired
    private DemoDao demoDao;


    @GET
    @Path("/do-something")
    public Response doSomething()  {
       return Response.ok(demoDao.doSomething()).build();
    }

    @GET
    @Path("/do-nothing")
    public Response doNothing()  {
        return Response.ok(demoDao.doNothing()).build();
    }
}
