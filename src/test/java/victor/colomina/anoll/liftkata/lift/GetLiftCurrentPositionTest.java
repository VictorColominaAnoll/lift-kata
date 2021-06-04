package victor.colomina.anoll.liftkata.lift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetLiftCurrentPositionTest {
    private Lift lift;

    @BeforeEach
    void setUp() {
        lift = new Lift();
    }

    @Test
    void whenNeverMoved_and_GetPosition_returnFloorZero() {
        assertEquals(lift.getCurrentPosition(), 0);
    }

    @Test
    void whenCurrentPositionChange_returnNewFloor() {
        givenNewDestination();

        whenMoveToTheNextDestination();

        assertEquals(lift.getCurrentPosition(), 1);
    }

    private void whenMoveToTheNextDestination() {
        lift.moveToNextDestination();
    }

    private void givenNewDestination() {
        lift.addNewDestination(new DestinationFloor(1, DestinationFloorEnum.UP));
    }
}
