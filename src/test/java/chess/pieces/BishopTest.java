package chess.pieces;

import com.trycatch.chess.pieces.Bishop;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class BishopTest {

    @Test
    public void testAttack() throws Exception {
        Bishop bishopA = new Bishop(1,1);
        Bishop bishopB = new Bishop(2,2);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Bishop bishopA = new Bishop(1,1);
        Bishop bishopB = new Bishop(8,1);
        Assert.assertFalse(bishopA.attacks(bishopB));
    }

}
