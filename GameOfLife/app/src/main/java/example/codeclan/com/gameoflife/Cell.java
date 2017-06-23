package example.codeclan.com.gameoflife;

/**
 * Created by user on 23/06/2017.
 */

public class Cell {

    static final

    static final Cell DEAD = new Cell(false);
    static final Cell ALIVE = new Cell(true);
    static final int RESURECTION = 3;


    boolean status;

    public Cell(boolean status){
        this.status = status;
    }

    @Override
    public boolean equals(Object otherCell){
        Cell cell = (Cell)otherCell;
        return this.status == cell.status;
    }

    public Cell tick(int numberOfNeighbours) {
        Cell next = new Cell(true);
        if(this.status) {
            ifLiveCell(numberOfNeighbours, next);
            return next;
        }
       else{
            ifDeadCell(numberOfNeighbours, next);
            return next;
            }
        }

    private void ifDeadCell(int numberOfNeighbours, Cell next) {
        if(ReproductionSuitability(numberOfNeighbours)){
            next.status = true;
        }
        else {
            next.status = false;
        }
    }

    private void ifLiveCell(int numberOfNeighbours, Cell next) {
        if(Underpopulated(numberOfNeighbours) || Overcrowding(numberOfNeighbours)) {
            next.status = false;
        } else {
            next.status = true;
        }
    }

    private boolean ReproductionSuitability(int numberOfNeighbours) {
        return numberOfNeighbours == 3;
    }

    private boolean Overcrowding(int numberOfNeighbours) {
        return numberOfNeighbours > 3;
    }

    private boolean Underpopulated(int numberOfNeighbours) {
        return numberOfNeighbours <= 2;
    }


//    public boolean getStatus() {
//        return this.status;
//    }
}
