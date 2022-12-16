package ie.atu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassenger()
    {
        List<Passenger> myPassenger = List.of(
                new Passenger("Ms", "Elise", "G003871700", "0830152926", 23),
                new Passenger("Ms", "Cliodhna", "G003186395", "0830162888", 22),
                new Passenger("Mr", "Corey", "G003765890", "0830157876", 21));
        return myPassenger;

    }

    public Passenger getPassenger(String PassengerID)
    {
        Passenger myPassenger = new Passenger("Ms", "Elise", "G003871700", "0830152926", 23);
        return myPassenger;
    }
}
