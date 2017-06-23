package example.codeclan.com.gameoflife;

/**
 * Created by user on 23/06/2017.
 */

public class Cell {

    boolean status;

    public Cell(boolean status){
        this.status = status;
    }

    public Cell tick(int numberOfNeighbours) {
        Cell next = new Cell(true);
        if(this.status) {
            if (numberOfNeighbours <= 2 || numberOfNeighbours > 3) {
                next.status = false;
            } else {
                next.status = true;
            }
            return next;
        }
       else{
            if (numberOfNeighbours == 3){
                next.status = true;
            }
            else {
                next.status = false;
            }
            return next;
            }
        }



    public boolean getStatus() {
        return this.status;
    }
}
