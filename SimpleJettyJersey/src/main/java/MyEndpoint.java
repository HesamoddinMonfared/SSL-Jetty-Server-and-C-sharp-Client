import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ep")
public class MyEndpoint {

    @Path("pi")
    @Produces(MediaType.TEXT_HTML)
    @GET
    public String ping(){
        return "Hello from ping";
    }
}
