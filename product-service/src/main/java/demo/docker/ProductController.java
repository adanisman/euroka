package demo.docker;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public String testService() {
		
		//biraz önce belirttimiz gibi ilk build ettiğimizde
		//bu şekilde edeceğiz sonrasında ise (return "Product Service 2";)
		//olarak build edeceğiz.
		return "Product Service Duygu";
    }
}
