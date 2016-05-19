package edu.learn.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/schoolLibrary/v1")
@Produces("application/json")
public interface SchoolLibrary {

    @GET
    @Produces("application/json")
    String borrowBooks();

    @GET
    @Produces("application/json")
    String returnBooks();
}
