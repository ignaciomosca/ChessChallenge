package chess.pieces;

import com.trycatch.chess.pieces.Queen;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class QueenTest {

    @Test
    public void testAttack1() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(7, 7);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack2() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(6,6);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack3() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(4, 6);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack4() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(3, 7);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack5() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(7, 3);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack6() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(6, 4);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack7() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(4, 4);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack8() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(3, 3);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack9() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(6, 5);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack10() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(7,5);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack11() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(4, 5);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack12() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(3, 5);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack13() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(5, 6);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack14() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(5, 7);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack15() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(5, 4);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testAttack16() throws Exception {
        Queen queenA = new Queen(5, 5);
        Queen queenB = new Queen(5, 3);
        Assert.assertTrue(queenA.attacks(queenB));
    }


    @Test
    public void testDoesNotAttack() throws Exception {
        Queen queenA = new Queen(1,1);
        Queen queenB = new Queen(3,4);
        Assert.assertFalse(queenA.attacks(queenB));
    }

}
