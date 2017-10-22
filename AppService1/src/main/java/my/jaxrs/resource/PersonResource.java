package my.jaxrs.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import my.model.Person;

@Path("/person")
public class PersonResource {
    
    @Path("get")
    @GET
    @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
    public Person getPerson(){
        
        Person p = new Person();
        p.setFirstName("Stephen");
        p.setLastName("Curry");
        p.setDateOfBirth("01.01.1980");
        p.setCitizenships( new String[]{"US", "USA"} );        
        Map<String, Object> creditCards = new HashMap<String, Object>();
        creditCards.put("MasterCard", "1234 1234 1234 1234");
        creditCards.put("Visa", "1234 1234 1234 1234");
        creditCards.put("dummy", true);
        p.setCreditCards(creditCards);
        System.out.println("REST call...");
        return p;
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    //@Produces({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/post")
    public String postPerson(Person pers) throws Exception{
        
        System.out.println("First Name = "+pers.getFirstName());
        System.out.println("Last Name  = "+pers.getLastName());
        
        return "ok";
    }

}
