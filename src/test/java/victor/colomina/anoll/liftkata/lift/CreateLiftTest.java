package victor.colomina.anoll.liftkata.lift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateLiftTest {
    @Test
    void create_lift() {
        Lift lift = new Lift();
        assertNotNull(lift);
    }


}
