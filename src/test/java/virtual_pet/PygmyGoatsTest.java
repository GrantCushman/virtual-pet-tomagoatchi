package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PygmyGoatsTest {

    private PygmyGoats underTest;

    @BeforeEach
    public void canCreatePygmyGoatsFromOrganicGoatsParent() {
        underTest = new PygmyGoats("Frank", "is a tank");
    }

    @Test
    public void pygmyGoatsShouldHaveVirtualandOrganicDefaults() {
        assertEquals("Frank", underTest.getName());
        assertEquals("is a tank", underTest.getDescription());
        assertEquals(0, underTest.getBoredomLevel());
        assertTrue(underTest.getIsAlive());
        assertEquals(10, underTest.getHungerLevel());
        assertEquals(10, underTest.getThirstLevel());
        assertEquals(0, underTest.getPenDirtLevel());
    }

    @Test
    public void pygmyGoatsCanBeFedWithUniqueOutcome() {
        //Pygmy goats lose 10 hunger from eating because they are smaller
        int defaultHunger = underTest.getHungerLevel();
        underTest.feedGoat();
        assertEquals(defaultHunger - 10, underTest.getHungerLevel());
    }

    @Test
    public void pygmyGoatsCanBeWateredWithUniqueOutcome() {
        //Pygmy goats lose 10 thirst from watering because they are smaller
        int defaultThirst = underTest.getThirstLevel();
        underTest.waterGoat();
        assertEquals(defaultThirst - 10, underTest.getThirstLevel());
    }

}
