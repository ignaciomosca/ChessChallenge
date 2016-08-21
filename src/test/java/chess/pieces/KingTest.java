package chess.pieces;

import com.trycatch.chess.pieces.King;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class KingTest {

    @Test
    public void testAttack() throws Exception {
        King kingA = new King(1,1);
        King kingB = new King(1,2);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        King kingA = new King(1,1);
        King kingB = new King(8,8);
        Assert.assertFalse(kingA.attacks(kingB));
    }

}
