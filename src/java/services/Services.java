/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author lsilvs
 */
@Path("services")
@RequestScoped
public class Services {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Services
     */
    public Services() {
    }

    /**
     * Retrieves representation of an instance of services.Services
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        return "{'menu': {\n" +
                "  'id': 'file',\n" +
                "  'value': 'File',\n" +
                "  'popup': {\n" +
                "    'menuitem': [\n" +
                "      {'value': 'New', 'onclick': 'CreateNewDoc()'},\n" +
                "      {'value': 'Open', 'onclick': 'OpenDoc()'},\n" +
                "      {'value': 'Close', 'onclick': 'CloseDoc()'}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";
    }

    /**
     * PUT method for updating or creating an instance of Services
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
