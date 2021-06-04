package victor.colomina.anoll.liftkata.lift;

import java.util.Objects;

public class DestinationFloor {

    private int floor;
    private DestinationFloorEnum direction;

    public DestinationFloor(int floor, DestinationFloorEnum direction) {
        this.floor = floor;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DestinationFloor that = (DestinationFloor) o;
        return floor == that.floor && direction == that.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, direction);
    }
}