package restcall;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@RequestMapping("/getData")
	private static void getEmployees() {
    final String uri = "http://universities.hipolabs.com/search?name=India";

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);

    System.out.println(result);
	}

}
