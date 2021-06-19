package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlpineGoatsTest {

    private AlpineGoats underTest;

    @BeforeEach
    public void canCreateAlpineGoatsFromOrganicGoatsParent() {
        underTest = new AlpineGoats("James", "likes giant peaches");
    }

    @Test
    public void alpineGoatsShouldHaveVirtualandOrganicDefaults() {
        assertEquals("James", underTest.getName());
        assertEquals("likes giant peaches", underTest.getDescription());
        assertEquals(0, underTest.getBoredomLevel());
        assertTrue(underTest.getIsAlive());
        assertEquals(10, underTest.getHungerLevel());
        assertEquals(10, underTest.getThirstLevel());
        assertEquals(0, underTest.getPenDirtLevel());
    }

    @Test
    public void alpineGoatsCanBeFedWithUniqueOutcome() {
        //Alpine goats lose 6 hunger from eating because they are bigger
        int defaultHunger = underTest.getHungerLevel();
        underTest.feedGoat();
        assertEquals(defaultHunger - 6, underTest.getHungerLevel());
    }

    @Test
    public void alpineGoatsCanBeWateredWithUniqueOutcome() {
        //Alpine goats lose 6 thirst from watering because they are bigger
        int defaultThirst = underTest.getThirstLevel();
        underTest.waterGoat();
        assertEquals(defaultThirst - 6, underTest.getThirstLevel());
    }

}
