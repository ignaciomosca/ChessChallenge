package chess.pieces;

import com.test.chess.pieces.Rook;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class RookTest {

    @Test
    public void testAttack1() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(6, 5);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack2() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(7,5);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack3() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(4, 5);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack4() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(3, 5);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack5() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(5, 6);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack6() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(5, 7);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack7() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(5, 4);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testAttack8() throws Exception {
        Rook rookA = new Rook(5, 5);
        Rook rookB = new Rook(5, 3);
        Assert.assertTrue(rookA.attacks(rookB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Rook rookA = new Rook(1,1);
        Rook rookB = new Rook(7,2);
        Assert.assertFalse(rookA.attacks(rookB));
    }

}
