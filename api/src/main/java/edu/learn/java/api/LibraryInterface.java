package edu.learn.java.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/schoolLibrary/v1")
@Produces("application/json")
public interface LibraryInterface {

    @GET
    @Produces("application/json")
    void borrowBooks();

    @GET
    @Produces("application/json")
    void returnBooks();
}
