package my.jaxrs.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import my.model.Temperature;

@Path("/temperature")
public class F2CResource {
    
    @Path("random")
    @GET
    @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
    public Temperature getTemprature(){
    		Temperature p = new Temperature();
    		p.random();
    		p.convertF2C();
        return p;
    }
    
    @Path("f2c")
    @GET
    @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
    public List<Temperature> getConvertionTable(){
    		List<Temperature> ret = new ArrayList<Temperature>();
    		for(int n=-100; n < 100; n++) {
        		Temperature p = new Temperature();
        		p.setFahrenheit(n);
        		p.convertF2C();
        		ret.add(p);
    		}
        return ret;
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/convert")
    public Temperature postPerson(Temperature t) throws Exception{
        System.out.println("F  = "+t.getFahrenheit());
        System.out.println("C = "+t.getCelsius());
        t.convertF2C();
        return t;
    }

}
