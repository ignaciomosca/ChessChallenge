package chess.pieces;

import com.trycatch.chess.pieces.Rook;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class RookTest {

    @Test
    public void testAttack() throws Exception {
        Rook rookA = new Rook(1,1);
        Rook rookB = new Rook(1,2);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Rook rookA = new Rook(1,1);
        Rook rookB = new Rook(7,2);
        Assert.assertFalse(rookA.attacks(rookB));
    }

}
