package com.graphql.endpoints;

import com.graphql.dao.DemoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

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
    public Response getMetrics()  {
       return Response.ok(demoDao.doSomething()).build();
    }
}
