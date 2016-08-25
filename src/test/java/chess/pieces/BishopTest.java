package chess.pieces;

import com.trycatch.chess.pieces.Bishop;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class BishopTest {

    @Test
    public void testAttack1() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(7, 7);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack2() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(6,6);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack3() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(4, 6);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack4() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(3, 7);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack5() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(7, 3);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack6() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(6, 4);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack7() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(4, 4);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testAttack8() throws Exception {
        Bishop bishopA = new Bishop(5, 5);
        Bishop bishopB = new Bishop(3, 3);
        Assert.assertTrue(bishopA.attacks(bishopB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Bishop bishopA = new Bishop(1, 1);
        Bishop bishopB = new Bishop(8, 1);
        Assert.assertFalse(bishopA.attacks(bishopB));
    }

}
