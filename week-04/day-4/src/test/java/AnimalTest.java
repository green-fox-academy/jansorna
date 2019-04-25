import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal testedAnimal;

    @Before
    public void beforeMethod() {
        testedAnimal = new Animal();
    }

    @Test
    public void Animal_initializingNewAnimal_toBeInitialized() {
        assertNotNull(testedAnimal);
    }

    @Test
    public void Animal_initializedAnimalHasCorrectThirsty_ThirtyEquals50() {
        int correctThirtyAmount = 50;
        assertEquals(correctThirtyAmount, testedAnimal.thirsty);
    }

    @Test
    public void Animal_initializedAnimalHasCorrectHunger_HungerEquals50() {
        int correctHungerAmount = 50;
        assertEquals(correctHungerAmount, testedAnimal.hunger);
    }

    @Test
    public void eat_letAnimalEat_hungerIsDecreasedBy1() {
        int decreasedHunger = testedAnimal.hunger - 1;
        testedAnimal.eat();
        assertEquals(decreasedHunger, testedAnimal.hunger);
    }

    @Test
    public void drink_letAnimalDrink_ThirtyIsDecreasedBy1() {
        int decreasedThirty = testedAnimal.thirsty - 1;
        testedAnimal.drink();
        assertEquals(decreasedThirty, testedAnimal.thirsty);
    }

    @Test
    public void play_letAnimalPlay_ThirtyAndHungerAreIncreasedBy1() {
        int increasedThirty = testedAnimal.thirsty + 1;
        int increasedHunger = testedAnimal.hunger + 1;

        testedAnimal.play();

        assertEquals(increasedThirty, testedAnimal.thirsty);
        assertEquals(increasedHunger, testedAnimal.hunger);
    }
}
