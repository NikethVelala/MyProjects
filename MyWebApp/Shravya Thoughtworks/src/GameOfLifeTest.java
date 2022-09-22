import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class GameOfLifeTest {
    @Test
    public void shouldReturnNewGenerationForBlockPattern(){
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 2));
        seed.add(new CoordinatesOfCell(2, 1));
        seed.add(new CoordinatesOfCell(2, 2));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(2, 2));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertEquals(resultantCells, newGeneration);
    }

    @Test
    void shouldReturnNewGenerationForBoatPattern() {
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(0, 1));
        seed.add(new CoordinatesOfCell(1, 0));
        seed.add(new CoordinatesOfCell(2, 1));
        seed.add(new CoordinatesOfCell(0, 2));
        seed.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(0, 1));
        resultantCells.add(new CoordinatesOfCell(1, 0));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(0, 2));
        resultantCells.add(new CoordinatesOfCell(1, 2));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertEquals(resultantCells, newGeneration);
    }

    @Test
    public void shouldReturnNewGenerationForBlinkerPattern() {
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 0));
        seed.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(0, 1));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertEquals(resultantCells, newGeneration);
    }

    @Test
    public void shouldReturnNewGenerationForToadPattern(){
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 2));
        seed.add(new CoordinatesOfCell(1, 3));
        seed.add(new CoordinatesOfCell(2, 2));
        seed.add(new CoordinatesOfCell(2, 3));
        seed.add(new CoordinatesOfCell(2, 4));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(2, 4));
        resultantCells.add(new CoordinatesOfCell(0, 2));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(1, 4));
        resultantCells.add(new CoordinatesOfCell(3, 3));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertEquals(resultantCells, newGeneration);
    }

    @Test
    public void shouldReturnFalseNewGenerationForBlockPattern(){
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 2));
        seed.add(new CoordinatesOfCell(2, 1));
        seed.add(new CoordinatesOfCell(2, 2));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertNotEquals(resultantCells, newGeneration);
    }

    @Test
    void shouldReturnFalseNewGenerationForBoatPattern() {
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(0, 1));
        seed.add(new CoordinatesOfCell(1, 0));
        seed.add(new CoordinatesOfCell(2, 1));
        seed.add(new CoordinatesOfCell(0, 2));
        seed.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(1, 0));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(0, 2));
        resultantCells.add(new CoordinatesOfCell(1, 2));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertNotEquals(resultantCells, newGeneration);
    }

    @Test
    public void shouldReturnFalseNewGenerationForBlinkerPattern() {
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 0));
        seed.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

       assertNotEquals(resultantCells, newGeneration);
    }

    @Test
    public void shouldReturnFalseNewGenerationForToadPattern(){
        ArrayList<CoordinatesOfCell> seed = new ArrayList<>();
        ArrayList<CoordinatesOfCell> resultantCells = new ArrayList<>();
        seed.add(new CoordinatesOfCell(1, 1));
        seed.add(new CoordinatesOfCell(1, 2));
        seed.add(new CoordinatesOfCell(1, 3));
        seed.add(new CoordinatesOfCell(2, 2));
        seed.add(new CoordinatesOfCell(2, 3));
        seed.add(new CoordinatesOfCell(2, 4));
        resultantCells.add(new CoordinatesOfCell(1, 1));
        resultantCells.add(new CoordinatesOfCell(2, 4));
        resultantCells.add(new CoordinatesOfCell(1, 2));
        resultantCells.add(new CoordinatesOfCell(2, 1));
        resultantCells.add(new CoordinatesOfCell(1, 4));
        resultantCells.add(new CoordinatesOfCell(3, 3));
        CoordinatesOfUniverse universeCoordinates = new CoordinatesOfUniverse(seed);

        ArrayList<CoordinatesOfCell> newGeneration = universeCoordinates.newGeneration();

        assertNotEquals(resultantCells, newGeneration);
    }
}