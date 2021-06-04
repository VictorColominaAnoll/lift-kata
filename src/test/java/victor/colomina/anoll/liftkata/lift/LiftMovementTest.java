package victor.colomina.anoll.liftkata.lift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LiftMovementTest {

    private Lift lift;

    @BeforeEach
    void setUp() {
        this.lift = new Lift();
    }

    @Test
    void add_new_destination() {
        lift.addNewDestination(createDestination());
    }

    @Test
    void whenNoDestinations_thenReturnEmpty() {
        assertTrue(lift.getDestinations().isEmpty());
    }

    @Test
    void whenContainsDestination_thenReturnDestination() {
        lift.addNewDestination(createDestination());

        Assertions.assertTrue(lift.getDestinations().contains(createDestination()));
    }

    @Test
    void whenAddMultiplesDestinations_thenReturnDestinations() {
        addMultipleDestinations(5);

        assertEquals(lift.getDestinations().size(), 5);
    }

    @Test
    void whenDuplicatedDestination_expectDuplicatedDestinationException() {
        lift.addNewDestination(createDestination());

        Assertions.assertThrows(
                DuplicatedDestinationException.class,
                () -> lift.addNewDestination(createDestination())
        );
    }

    private void addMultipleDestinations(int numberOfDestinations) {
        for (int i = 0; i < numberOfDestinations; i++) {
            lift.addNewDestination(createDestination(i + 1));
        }
    }

    private DestinationFloor createDestination() {
        return createDestination(1);
    }

    private DestinationFloor createDestination(int i) {
        return new DestinationFloor(i, DestinationFloorEnum.UP);
    }
}
