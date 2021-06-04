package victor.colomina.anoll.liftkata.lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lift {

    private List<DestinationFloor> destinations;

    public Lift() {
        destinations = new ArrayList<>();
    }

    public void addNewDestination(DestinationFloor destination) {
        if(this.destinations.contains(destination))
            throw new DuplicatedDestinationException();

        this.destinations.add(destination);
    }

    public List<DestinationFloor> getDestinations() {
        return this.destinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lift lift = (Lift) o;
        return destinations.equals(lift.destinations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinations);
    }
}
