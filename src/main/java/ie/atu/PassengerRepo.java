package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    public Passenger findPassengerByName(String name);
}
