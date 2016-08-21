package chess.pieces;

import com.trycatch.chess.pieces.Queen;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class QueenTest {

    @Test
    public void testAttack() throws Exception {
        Queen queenA = new Queen(1,1);
        Queen queenB = new Queen(2,2);
        Assert.assertTrue(queenA.attacks(queenB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Queen queenA = new Queen(1,1);
        Queen queenB = new Queen(3,4);
        Assert.assertFalse(queenA.attacks(queenB));
    }

}
