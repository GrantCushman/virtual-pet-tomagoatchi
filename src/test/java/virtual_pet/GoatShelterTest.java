package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoatShelterTest {

    private GoatShelter goatShelter = new GoatShelter();


    private static VirtualGoats underTestAlpine = new AlpineGoats("Ricardo", "loves to salsa");
    private static VirtualGoats underTestPygmy = new PygmyGoats("Tiny", "sick of short jokes");
    private static VirtualGoats underTestRoboAlpine = new RoboAlpine("Biggy", "misses Tupac");
    private static VirtualGoats underTestRoboPygmy = new RoboPygmy("Alfred", "sick of Bruce's shit");

    @BeforeEach
    public void canAddOrganicGoatsToShelterList() {
        goatShelter.addGoatToShelter(underTestAlpine);
        goatShelter.addGoatToShelter(underTestPygmy);
        goatShelter.addGoatToShelter(underTestRoboAlpine);
        goatShelter.addGoatToShelter(underTestRoboPygmy);

        assertEquals("Ricardo", goatShelter.shelterList.get(0).getName());
        assertEquals("Tiny", goatShelter.shelterList.get(1).getName());
    }

    @Test
    public void canRemoveOrganicGoatsFromShelterList() {
//        goatShelter.removeGoatFromShelter(underTestAlpine);
//        goatShelter.removeGoatFromShelter(underTestPygmy);
        assertTrue(goatShelter.shelterList.size() == 0);

    }

    @Test
    public void canPrintGoatList() {
        goatShelter.printShelterList();
    }

    @Test
    public void canAddSelectedGoatsToSelectionList() {
        goatShelter.selectionList.add(underTestAlpine);
        goatShelter.printSelectionList();
    }

    @Test
    public void canCleanAllGoatPens() {
        goatShelter.cleanGoatPens();
        int currentLevel = ((OrganicGoats) goatShelter.shelterList.get(0)).penDirtLevel;
        assertEquals(0,currentLevel);
    }

    @Test
    public void canMaintainRobotGoats() {
        goatShelter.maintRoboGoats();
        int currentLevel = ((RoboticGoats) goatShelter.shelterList.get(2)).maintLevel;
        assertEquals(0,currentLevel);
    }

}
