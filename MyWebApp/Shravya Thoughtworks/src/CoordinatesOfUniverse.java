import java.util.ArrayList;

class CoordinatesOfUniverse {
    private final ArrayList<CoordinatesOfCell> seed;

    CoordinatesOfUniverse(ArrayList<CoordinatesOfCell> seed) {
        this.seed = seed;
    }

    ArrayList<CoordinatesOfCell> newGeneration() {
        ArrayList<CoordinatesOfCell> liveCell = new ArrayList<>(seed);
        for (CoordinatesOfCell seed : seed) {
            this.kill(liveCell, seed);
        }
        for (CoordinatesOfCell seed : this.seed) {
            this.generate(liveCell, seed);
        }
        return liveCell;
    }

    public void kill(ArrayList<CoordinatesOfCell> liveCell, CoordinatesOfCell seed) {
        int activeCells;
        ArrayList<CoordinatesOfCell> nextCell = seed.nextCell();
        activeCells = (int) nextCell.stream()
                .filter(this.seed::contains).count();
        if (activeCells < 2 || activeCells > 3) {
            liveCell.remove(seed);
        }
    }

    public void generate(ArrayList<CoordinatesOfCell> liveCell, CoordinatesOfCell seed) {
        int activeCells;
        ArrayList<CoordinatesOfCell> nextCell = seed.nextCell();
        for (CoordinatesOfCell cell : nextCell) {
            ArrayList<CoordinatesOfCell> cellNeighbour = cell.nextCell();
            activeCells = (int) cellNeighbour.stream().filter(this.seed::contains).count();
            if (activeCells == 3) {
                if (!liveCell.contains(cell)) {
                    liveCell.add(cell);
                }
            }
        }
    }
}