package ie.atu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/Passenger")

public class PassengerController {
    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
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

    //Save Operation
    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger passenger)
    {
        myService.savePassenger(passenger);
    }

    //Find Passenger by name
    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name") String name)
    {
        return myService.findPassengerByName(name);
    }
}
