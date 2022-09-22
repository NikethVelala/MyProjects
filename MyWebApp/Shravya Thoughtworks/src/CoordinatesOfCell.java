import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class CoordinatesOfCell {
    private final int xCoordinate;
    private final int yCoordinate;

    CoordinatesOfCell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    private void nextCell(int row, List<CoordinatesOfCell> nextCell) {
        int y = this.yCoordinate;
        for (int columnValue = y - 1; columnValue <= y + 1; columnValue++) {
            if (row != this.xCoordinate || columnValue != y) {
                nextCell.add(new CoordinatesOfCell(row, columnValue));
            }
        }
    }

    ArrayList<CoordinatesOfCell> nextCell() {
        int x = this.xCoordinate;
        ArrayList<CoordinatesOfCell> nextCell = new ArrayList<>();
        for (int rowValue = x - 1; rowValue <= x + 1; rowValue++) {
            this.nextCell(rowValue, nextCell);
        }
        return nextCell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoordinatesOfCell cell = (CoordinatesOfCell) o;
        return xCoordinate == cell.xCoordinate && yCoordinate == cell.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }
}