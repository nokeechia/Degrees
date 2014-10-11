package NER;

/**
 * Created by Keech on 11/10/2014.
 */

        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;

@Path("/ping")
public class PingResource {


    @GET
    @Produces(value = "application/json")
    public String ping() {
        return "{'ping': 'pong!!'}";
    }
}