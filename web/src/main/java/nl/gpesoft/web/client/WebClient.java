package nl.gpesoft.web.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class WebClient implements IEmployee {

    public static void main(String[] args) {
        WebClient webClient = new WebClient();
        webClient.isEmployeePresent(1L);
    }

   public Boolean isEmployeePresent(Long id) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/multimodule/rest");
        WebTarget resourceWebTarget = webTarget.path("employee/" + id);

        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.TEXT_PLAIN_TYPE);
        invocationBuilder.header("some-header", "true");

        Response response = invocationBuilder.get();
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }
        else {
            System.out.println(response.readEntity(Boolean.class));
            return (Boolean) response.getEntity();
        }
    }
}