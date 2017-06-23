package example.codeclan.com.gameoflife;


import android.telecom.Call;

import org.junit.Test;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static example.codeclan.com.gameoflife.Cell.ALIVE;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class CellTest {

//    @Test
//    public void WhenCellCreated_IsValidObject(){
//        Cell cell = new Cell();
//        assertNotNull(cell);
//    }

    @Test
    public void DeadCell_WhenThreeNeighbours_AliveNextGen(){
        Cell deadCell = new Cell(true);
        Cell nextGeneration = deadCell.tick(3);
        assertEquals(Cell.ALIVE, nextGeneration);

    }


    @Test
    public void DeadCell_WhenTwoNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell(true);
        Cell nextGeneration = deadCell.tick(2);
        assertEquals(Cell.DEAD, nextGeneration);
    }
//
    @Test
    public void DeadCell_WhenLessThanTwoNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell(true);
        Cell nextGeneration = deadCell.tick(1);
        assertEquals(Cell.DEAD, nextGeneration);
    }
//
    @Test
    public void DeadCell_WhenThreeOrMoreNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell(true);
        Cell nextGeneration = deadCell.tick(4);
        assertEquals(Cell.DEAD, nextGeneration);
    }
//
    @Test
    public void DeadCell_WithExactlyThreeLiveNeighbours_AliveInNextGen(){
        Cell deadCell = new Cell(false);
        Cell nextGeneration = deadCell.tick(3);
        assertEquals(Cell.ALIVE, nextGeneration);
    }
}
