import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorrierTest {

    Worrier underTest = new Worrier("Odysseus", 100, 100,
            20, 60,100, true);

    @Test
    public void shouldHaveADefaultHealthStatusOf100(){
        int actualHealth = underTest.getHealth();
        assertEquals(100, actualHealth);
    }
}
