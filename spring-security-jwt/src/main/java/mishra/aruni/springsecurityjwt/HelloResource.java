package mishra.aruni.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

	@RequestMapping({"/helllo"})
	
	public String hello() {
		return "hello";
	}
}
