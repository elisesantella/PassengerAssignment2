package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/Passenger")
public class PassengerApplication {

	PassengerService myService;

	@Autowired
	public PassengerApplication(PassengerService myService) {
		this.myService = myService;
	}


	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassenger()
	{
		return myService.getPassenger();
	}

	@GetMapping("/{PassengerID}")
	public Passenger getPassenger(@PathVariable String PassengerID)
	{
		return myService.getPassenger(PassengerID);
	}

}
