import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Vector")
class VectorTest {

    private Vector firstVector;

    private Vector secondVector;


    @Test
    @DisplayName("should return added vectors")
    void add() {
        firstVector = new Vector(1, 2);
        secondVector = new Vector(3, 3);

        assertEquals(new Vector(4, 5), firstVector.add(secondVector));
    }

    @Test
    @DisplayName("should return added vectors with negatives")
    void addNegatives() {
        firstVector = new Vector(1, -7);
        secondVector = new Vector(-1, -8);

        assertEquals(new Vector(0, -15), firstVector.add(secondVector));
    }

    @Test
    @DisplayName("should cross positiv vectors")
    void cross() {
        firstVector = new Vector(1, 2);
        secondVector = new Vector(3, 3);

        assertEquals(new BigDecimal(-3), firstVector.cross(secondVector));
    }

    @Test
    @DisplayName("should cross negativ vectors")
    void crossNegatives() {
        firstVector = new Vector(-11, -2);
        secondVector = new Vector(-4, 3);

        assertEquals(new BigDecimal(-41), firstVector.cross(secondVector));
    }
}