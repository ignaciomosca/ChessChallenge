package chess.pieces;

import com.trycatch.chess.pieces.Knight;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class KnightTest {

    @Test
    public void testAttack() throws Exception {
        Knight knightA = new Knight(1,1);
        Knight knightB = new Knight(3,2);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Knight knightA = new Knight(1,1);
        Knight knightB = new Knight(8,8);
        Assert.assertFalse(knightA.attacks(knightB));
    }
}
